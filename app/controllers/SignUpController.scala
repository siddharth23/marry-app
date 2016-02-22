package controllers

import models.User
import play.api.mvc.{Controller, _}
import play.twirl.api.Html
import services.RegisterService

class SignUpController extends Controller {


  def register() = Action {
    request =>
      val firstName=request.getQueryString("firstname").getOrElse("")
      val email=request.getQueryString("email").getOrElse("")


      val user = User(firstName, email)
      val register = new RegisterService()
      val response = register.registerUser(user) match {
        case Right => new Html("Registered Successfully")
        case _ => new Html("Registration failed")
      }
      Ok(response)
  }
}

object SignUpController extends SignUpController
