package controllers

import play.api.mvc._

class ProfileController extends Controller {
  def getProfile(id: String) = Action {
    Ok(views.html.profile())
  }
}
