package controllers;

import java.util.HashMap;

import play.Logger;
import play.mvc.Controller;

public class TestApi extends Controller {

	public static void Test(Long paramA,String paramB,String paramC){
		HashMap<String,Object> result=new HashMap<String,Object>();
		Logger.info("func[Test]params["+params+"]");
		result.put("code", "100");
		result.put("msg", "ok");
		renderJSON(result);
	}
}
