package services

import models.User
import utils.RestClient

class RegisterService {
  val restClient = new RestClient

  def registerUser(user: User) = {
    val json = "{\"user\":{\"name\":\"" + user.name + "\",\"email\":\"" + user.email + "\"}}"
    println(json)
    restClient.post("http://classic-d2q5j7c5.cloudapp.net/api/register", json, Map(("Content-Type", "application/json")))
  }
}
