package controllers;

import java.util.List;

import models.OmsOrder;

import play.*;

import play.data.Form;


import play.db.ebean.Model;
import play.mvc.*;
import views.html.*;

import java.util.List;

import com.avaje.ebean.PagedList;

import static play.libs.Json.toJson;

public class Application extends Controller {

    public Result index() {
        return ok(index.render("Your new application is ready."));
    }
    
    public Result getOrders(int page) {
    	List<OmsOrder> orders = new Model.Finder(String.class, OmsOrder.class).findPagedList(page, 10).getList();
    	return ok(toJson(orders));
    }
    
    public Result show(long id){
    	OmsOrder order = OmsOrder.find.byId(id);
    	
    	return ok(toJson(order));
    }

}
