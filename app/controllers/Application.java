package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

import models.Camera;

import play.data.Form;

import java.util.List;

import play.db.ebean.Model;

import static play.libs.Json.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render());
    }

    public static Result addPerson() {
    	Camera person = Form.form(Camera.class).bindFromRequest().get();
    	person.save();
    	return redirect(routes.Application.index());
    }

    public static Result getPersons() {
    	List<Camera> persons = new Model.Finder(String.class, Camera.class).all();
    	return ok(toJson(persons));
    }
}
