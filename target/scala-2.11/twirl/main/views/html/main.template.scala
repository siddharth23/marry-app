
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,Html,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content1: Html,login:Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.44*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">
<head>
    <title>"""),_display_(/*7.13*/title),format.raw/*7.18*/("""</title>
    <meta charset='utf-8'>
    <title>Lelouch Of Rebellion</title>
    <meta name="description" content="Anime">

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css"
          integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">
    <link href='http://fonts.googleapis.com/css?family=Tangerine' rel='stylesheet' type='text/css'>


    <link rel="stylesheet" media="screen" href=""""),_display_(/*17.50*/routes/*17.56*/.Assets.versioned("stylesheets/desk.css")),format.raw/*17.97*/("""">
    <link rel='stylesheet' href='"""),_display_(/*18.35*/routes/*18.41*/.WebJarAssets.at(WebJarAssets.locate("css/bootstrap.min.css"))),format.raw/*18.103*/("""'>
    <script>
        """),_display_(/*20.10*/Html(org.webjars.RequireJS.getSetupJavaScript(routes.WebJarAssets.at("").url))),format.raw/*20.88*/("""

    """),format.raw/*22.5*/("""</script>
    <script type='text/javascript' src='"""),_display_(/*23.42*/routes/*23.48*/.WebJarAssets.at(WebJarAssets.locate("jquery.min.js"))),format.raw/*23.102*/("""'></script>
    <script type='text/javascript' src='"""),_display_(/*24.42*/routes/*24.48*/.WebJarAssets.at(WebJarAssets.locate("bootstrap.min.js"))),format.raw/*24.105*/("""'></script>
    <script type='text/javascript' src='"""),_display_(/*25.42*/routes/*25.48*/.WebJarAssets.at(WebJarAssets.locate("TweenMax.min.js"))),format.raw/*25.104*/("""'></script>
    <script type='text/javascript' src='"""),_display_(/*26.42*/routes/*26.48*/.WebJarAssets.at(WebJarAssets.locate("ScrollMagic.js"))),format.raw/*26.103*/("""'></script>
    <script type='text/javascript' src='"""),_display_(/*27.42*/routes/*27.48*/.WebJarAssets.at(WebJarAssets.locate("jquery.gsap.min.js"))),format.raw/*27.107*/("""'></script>
</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top" id="my-navbar">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbar-collapse">
                <Span class="icon-bar"></Span>
                <Span class="icon-bar"></Span>
                <Span class="icon-bar"></Span>
                <Span class="icon-bar"></Span>
                <Span class="icon-bar"></Span>
            </button>
            <a href="" class="navbar-brand"> Home </a>
        </div>
        <!-- navbar header-->
        <div class="collapse navbar-collapse" id="navbar-collapse">
            <ul class="nav navbar-nav">
                <li><a href="">Gallery</a>
                <li><a href="">Contact Us</a>
                <li><a href="">Features</a>
                <li><a href="">Faqs</a>
                <li><a href="">Feedback</a>
            </ul>
        </div>
        <div>"""),_display_(/*52.15*/login),format.raw/*52.20*/("""</div>
        <!--end of toggle list-->
    </div>
    <!--end of container -->
</nav>

</div>

"""),_display_(/*60.2*/content1),format.raw/*60.10*/("""

"""),format.raw/*62.1*/("""</body>
</html>
"""))
      }
    }
  }

  def render(title:String,content1:Html,login:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content1,login)

  def f:((String) => (Html,Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content1,login) => apply(title)(content1,login)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Sat Jan 16 11:48:35 IST 2016
                  SOURCE: /Users/siddharthkala/marry-app/app/views/main.scala.html
                  HASH: 07640efc2a0b7ae20d9f97a9763991e287096e12
                  MATRIX: 535->1|672->43|700->45|779->98|804->103|1334->606|1349->612|1411->653|1475->690|1490->696|1574->758|1626->783|1725->861|1758->867|1836->918|1851->924|1927->978|2007->1031|2022->1037|2101->1094|2181->1147|2196->1153|2274->1209|2354->1262|2369->1268|2446->1323|2526->1376|2541->1382|2622->1441|3648->2440|3674->2445|3798->2543|3827->2551|3856->2553
                  LINES: 20->1|25->1|27->3|31->7|31->7|41->17|41->17|41->17|42->18|42->18|42->18|44->20|44->20|46->22|47->23|47->23|47->23|48->24|48->24|48->24|49->25|49->25|49->25|50->26|50->26|50->26|51->27|51->27|51->27|76->52|76->52|84->60|84->60|86->62
                  -- GENERATED --
              */
          