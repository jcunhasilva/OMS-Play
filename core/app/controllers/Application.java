package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public Result index() {
        //return ok(index.render("Your new application is ready."));
    	return ok(main.render("Bla bla", new play.twirl.api.Html("<li>kjskjds</li>")));
    }

}
