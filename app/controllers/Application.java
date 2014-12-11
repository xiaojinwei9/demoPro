package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
    	Logger.info("index...");
    	Logger.info("index...2");
    	Logger.info("index...3");
    	Logger.info("index...4");
        render();
    }

}