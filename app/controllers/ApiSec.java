package controllers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.codehaus.groovy.util.StringUtil;

import play.Logger;
import play.mvc.Before;
import play.mvc.Controller;
import play.mvc.Http.Request;
import utils.StringUtils;

public class ApiSec extends Controller {

	@Before
	static void checkToken(){
		Logger.info("checkToken...");
		/////////////
		Request request=Request.current.get();
		String requestUrl=request.url;
		Logger.info("requestUrl:"+requestUrl);
		requestUrl=requestUrl.trim().toLowerCase(); 
		Logger.info("requestUrlB:"+requestUrl);
		requestUrl=requestUrl.replace("?", "&");
		Logger.info("requestUrlC:"+requestUrl);
		String[] urlArr=requestUrl.split("&");
		Map<String, String> paramsMapA=new HashMap<String,String>();
		for(String req:urlArr){
			if(req.indexOf("=")!=-1){
				String[] reqArr=req.split("=");
				if(!StringUtils.isEmpty(reqArr[0])&&!StringUtils.isEmpty(reqArr[1])){
					paramsMapA.put(reqArr[0], reqArr[1]);
				}
			}
		}
		Logger.info("paramsA:" + paramsMapA);
		Object[] paramsKeysA = paramsMapA.keySet().toArray();
		Arrays.sort(paramsKeysA);
		String tokenStrA = "sky";
		for (int i = 0; i < paramsKeysA.length; i++) {
			Logger.info("paramsKeysA>" + paramsKeysA[i] + ">"
					+ paramsMapA.get(paramsKeysA[i]));
			tokenStrA += paramsMapA.get(paramsKeysA[i]);
		}
		Logger.info("tokenStrA:" + tokenStrA);
		Logger.info("md5StrA:" + StringUtils.md5(tokenStrA));
		
		/////////////
		Map<String, String> paramsMap = params.allSimple();
		Logger.info("params:" + paramsMap);
		Object[] paramsKeys = paramsMap.keySet().toArray();
		Arrays.sort(paramsKeys);
		String tokenStr = "sky";
		for (int i = 0; i < paramsKeys.length; i++) {
			Logger.info("paramsKeys>" + paramsKeys[i] + ">"
					+ paramsMap.get(paramsKeys[i]));
			tokenStr += paramsMap.get(paramsKeys[i]);
		}
		Logger.info("tokenStr:" + tokenStr);
		Logger.info("md5Str:" + StringUtils.md5(tokenStr));
	}
}
