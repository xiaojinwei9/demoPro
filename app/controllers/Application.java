package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
    	String msg="index开始";
        render(msg);
    }

    public static void topMenu(){
    	render();
    }
    public static void com(){
    	render();
    }
    public static void pro(){
    	render();
    }
    public static void know(){
    	render();
    }
    public static void about(){
    	render();
    }
    
    public static void saveTestTb(Long userId,String userName){
    	Logger.info("func[saveTestTb]userId["+userId+"]userName["+userName+"]");
    	HashMap<String,Object> result =new HashMap<String,Object>();
    	TestTb tb=new TestTb(userId,userName);
    	tb.save();
    	result.put("code", "100");
    	result.put("msg", "操作成功");
    	Logger.info("func[saveTestTb]userId["+userId+"]userName["+userName+"]result["+result+"]");
    	renderJSON(result);
    }
}