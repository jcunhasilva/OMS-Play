package controllers;

import static play.libs.Json.toJson;
import play.*;
import play.db.ebean.Model;
import play.mvc.*;
import models.OmsOrder;

import java.util.List;

import views.html.*;

public class Application extends Controller {

    public Result index() {
    	List<OmsOrder> orders = new Model.Finder(String.class, OmsOrder.class).all();
    	return ok(toJson(orders));
    }
    
    public Result getOrders() {
    	List<OmsOrder> orders = new Model.Finder(String.class, OmsOrder.class).all();
    	return ok(toJson(orders));
    }
}
