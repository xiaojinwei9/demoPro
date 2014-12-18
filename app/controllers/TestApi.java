package controllers;

import java.util.HashMap;

import models.TestTb;
import play.mvc.Controller;
import play.mvc.With;

@With(ApiSec.class)
public class TestApi extends Controller {

	public static void Test(Long paramA,String paramB,String paramC){
		HashMap<String,Object> result=new HashMap<String,Object>();
		TestTb tb=new TestTb(paramA,paramB);
		tb.save();
		result.put("code", "100");
		result.put("msg", "ok");
		renderJSON(result);
	}
}
