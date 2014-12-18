package controllers;

import java.util.Map;

import play.Logger;
import play.mvc.Before;
import play.mvc.Controller;

public class ApiSec extends Controller {

	@Before
	static void checkToken(){
		Logger.info("checkToken...");
		 Map<String, String> paramsAll=params.allSimple();
		 Logger.info("params:"+paramsAll);
	}
}
