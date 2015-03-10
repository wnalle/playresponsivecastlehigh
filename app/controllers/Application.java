package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.Index;

/**
 * Provides controllers for this application.
 */
public class Application extends Controller {

  /**
   * Returns the home page.
   * @return The resulting home page.
   */
  public static Result index() {
    return ok(Index.render("Welcome to the home page."));
  }

  public static Result contact() {
    return ok(Index.render("Welcome to the contact page."));
  }

  public static Result fns() {
    return ok(Index.render("Welcome to the faculty and staff page."));
  }

  public static Result snp() {
    return ok(Index.render("Welcome to the students and parents page."));
  }

  public static Result anf() {
    return ok(Index.render("Welcome to the Alumni page."));
  }

}
