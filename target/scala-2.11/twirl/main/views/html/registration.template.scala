
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object registration_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class registration extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""
"""),format.raw/*2.1*/("""<!--jumbotron -->
<div class="carousel">
    <div class=" carousel slide carousel-fade" id="bg-fade-carousel" data-ride="carousel">
        <div class="carousel-inner">
            <div class="item active">
                <div class="slide1 darken"></div>
            </div>
            <div class="item">
                <div class="slide2 darken"></div>
            </div>
            <div class="item">
                <div class="slide3 darken"></div>
            </div>
        </div> <!-- End carousel inner-->
        <div class="container carousel-overlay text-center">
            <!-- #F0626A -->
            <h2>Start Your Journey</h2>
            <hr></hr>
            <h3>The desire to reach for the stars is ambitious.<h3>
                <h3>The desire to reach hearts is wise.</h3>
                <a href="" class="button center-block">
                    <span class="fa fa-sign-in">Sign Up</span>
                </a>
        </div>
    </div>
</div><!-- End jumbotron-->

<section>
    <div class="container">
        <div class="page-header text-center">
            <h2>WiredTree History</h2>
        </div>
        <p >
            Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
            Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.
            Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.
        <p> Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
            Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
            Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
        </p>
        <p>
            Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.
            Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
        </p>
    </div>
</section>

<section class="section-feature">
    <div class="container ">

        <div class="row">
            <div class="col-md-3">
                <h3 class="clearfix icon-text"><span class="icon icon-feature icon-chart pull-left ">
        </span>Lorem ipsum dolor sit amet</h3>
                <p>
                    Excepteur sint occaecat cupidatat non proident
                </p>
            </div>
            <div class="col-md-3">
                <h3 class="clearfix icon-text"><span class="icon icon-feature icon-meter pull-left">
      </span>Lorem ipsum dolor sit amet</h3>
                <p>
                    Excepteur sint occaecat cupidatat non proident
                </p>
            </div>
            <div class="col-md-3">
                <h3 class="clearfix icon-text"><span class="icon icon-feature icon-life-saver pull-left">
      </span>Lorem ipsum dolor sit amet</h3>
                <p>
                    Excepteur sint occaecat cupidatat non proident
                </p>
            </div>
            <div class="col-md-3">
                <h3 class="clearfix icon-text"><span class="icon icon-feature icon-buildings pull-left">
      </span>Lorem ipsum dolor sit amet</h3>
                <p>
                    Excepteur sint occaecat cupidatat non proident
                </p>
            </div>
        </div>
    </div>
</section>

<div class="about text-center">
    <div id="with-background" >
        <div id="text">
            <h1>RandomText</h1>
            <h2>Lorem ipsum dolor sit amet, consectetur adipisicing elite</h2>
            <!-- <div class="mask"></div> -->
        </div>
    </div>
</div>

<section class="logon-banner blue2_bg text-center">
    <h2 class="page-header">
        Start your journey
    </h2>
    <p class="lead">
        Lorem ipsum dolor sit amet, consectetur adipisicing elit,
        sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
    </p>
    <a href="" class="btn btn-round btn-outline-default btn-md text-center">
        Sign Up
    </a>
</section>

<!-- Start who we are -->
<section id="aboutus">
    <div class="container">
        <blockquote>
            What drives us
        </blockquote>
        <h2>
            Lorem ipsum dolor sit amet, consectetur adipisicing elit,
            sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
        </h2>
    </div>

</section>
<section>
    <div class="well">
        <div class="container text-center">
            <h3>Subscribe for more stuff</h3>
            <p>Enter your name and Email</p>
            <form action="" class="form-inline">
                <div class="form-group">
                    <label for="subscription">Subscribe</label>
                    <input type="text" placeholder="your name" id="subscription" class="form-control">
                </div>
                <div class="form-group">
                    <label for="email">Email Address</label>
                    <input type="text" placeholder="your email" id="email" class="form-control">
                </div>
                <button type="submit" class="btn btn-warning">Submit</button>
            </form>
        </div>
    </div>
</section>


<script src=""""),_display_(/*142.15*/routes/*142.21*/.Assets.at("javascripts/animation.gsap.js")),format.raw/*142.64*/(""""></script>
<script type="text/javascript">
// var controller = new ScrollMagic.Controller();

$(function() """),format.raw/*146.14*/("""{"""),format.raw/*146.15*/("""
  """),format.raw/*147.3*/("""var controller = new ScrollMagic.Controller("""),format.raw/*147.47*/("""{"""),format.raw/*147.48*/("""
      """),format.raw/*148.7*/("""vertical:true,
      globalSceneOption: """),format.raw/*149.26*/("""{"""),format.raw/*149.27*/("""
    """),format.raw/*150.5*/("""triggerHook: 'OnEnter'
  """),format.raw/*151.3*/("""}"""),format.raw/*151.4*/("""
    """),format.raw/*152.5*/("""}"""),format.raw/*152.6*/(""");

  var tween = new TimelineMax()
  .add([
    TweenMax.to("#with-background", 5, """),format.raw/*156.40*/("""{"""),format.raw/*156.41*/("""backgroundPosition: "0 220%", ease: Linear.easeNone"""),format.raw/*156.92*/("""}"""),format.raw/*156.93*/("""),
    TweenMax.to("#text", 5, """),format.raw/*157.29*/("""{"""),format.raw/*157.30*/("""backgroundPosition: "0% 200%", ease: Linear.easeNone"""),format.raw/*157.82*/("""}"""),format.raw/*157.83*/(""")
  ]);
  var scene = new ScrollMagic.Scene("""),format.raw/*159.37*/("""{"""),format.raw/*159.38*/("""triggerElement: "#with-background",triggerHook: 'onEnter', duration:1500, offset:20"""),format.raw/*159.121*/("""}"""),format.raw/*159.122*/(""")
              .setTween(tween)
              // .setPin("#text")
              .addTo(controller);
"""),format.raw/*163.1*/("""}"""),format.raw/*163.2*/(""");
</script>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object registration extends registration_Scope0.registration
              /*
                  -- GENERATED --
                  DATE: Sat Jan 16 11:48:35 IST 2016
                  SOURCE: /Users/siddharthkala/marry-app/app/views/registration.scala.html
                  HASH: ec4d94c74926d301f85c5bc39f8a23080dcc3212
                  MATRIX: 534->1|630->3|657->4|6106->5425|6122->5431|6187->5474|6324->5582|6354->5583|6385->5586|6458->5630|6488->5631|6523->5638|6592->5678|6622->5679|6655->5684|6708->5709|6737->5710|6770->5715|6799->5716|6912->5800|6942->5801|7022->5852|7052->5853|7112->5884|7142->5885|7223->5937|7253->5938|7326->5982|7356->5983|7469->6066|7500->6067|7629->6168|7658->6169
                  LINES: 20->1|25->1|26->2|166->142|166->142|166->142|170->146|170->146|171->147|171->147|171->147|172->148|173->149|173->149|174->150|175->151|175->151|176->152|176->152|180->156|180->156|180->156|180->156|181->157|181->157|181->157|181->157|183->159|183->159|183->159|183->159|187->163|187->163
                  -- GENERATED --
              */
          