package utils

import org.slf4j.LoggerFactory
import play.api.Play.current
import play.api.libs.concurrent.Execution.Implicits._
import play.api.libs.ws._


class RestClient {
  private val logger = LoggerFactory.getLogger(this.getClass)

  def post(url: String, body: String, headers: Map[String, String]) = {

    executePostForResponse(url, body, headers) map {
      case Right(response) => Right(response.body.trim)
      case Left((status, response)) => Left((status, response))
    }
  }

  private def executePostForResponse(url: String, body: String, headers: Map[String, String]) = {
    println(url+"\n")
    println(body+"\n")
    println(headers)
    WS.url(url)
      .withHeaders(headers.toSeq: _*)
      .post(body)
      .map(response => {
        println(response)
        response.status match {
          case 204 => println("****here");Right(response)

          case _ => println("****there");Left((response.status, response.body.trim))
        }
      })
  }

}