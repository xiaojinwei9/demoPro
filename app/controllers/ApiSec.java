package controllers;

import java.util.Arrays;
import java.util.Map;

import play.Logger;
import play.mvc.Before;
import play.mvc.Controller;
import utils.StringUtils;

public class ApiSec extends Controller {

	@Before
	static void checkToken(){
		Logger.info("checkToken...");
		 Map<String, String> paramsMap=params.allSimple();
		 Logger.info("params:"+paramsMap);
		 Object[] paramsKeys=paramsMap.keySet().toArray();
		  Arrays.sort(paramsKeys);
		  for (int i = 0; i < paramsKeys.length; i++) {
			     Logger.info("paramsKeys>"+paramsKeys[i]+">"+paramsMap.get(paramsKeys[i]));
			}
		 Logger.info("md5"+StringUtils.md5("aaabbbccc"));
	}
}
