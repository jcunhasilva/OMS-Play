package controllers;

import java.util.List;

import models.OmsOrder;

import play.*;

import play.mvc.*;

import views.html.*;



public class Application extends Controller {

    public Result index() {
        
    	List<OmsOrder> orders = OmsOrder.find.where()
    	    //.ilike("name", "%sample%")
    	    //.orderBy("createdAt asc")
    	    .findList();	
    	
    	return ok(index.render("Your new application is ready."));
    }

}
