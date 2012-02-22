
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.Html = {
        _display_ {

Seq(format.raw/*1.32*/("""

<!DOCTYPE html>

<html>
    <head>
		<meta charset="utf-8">
        <title>"""),_display_(Seq(/*8.17*/title)),format.raw/*8.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq(/*9.54*/routes/*9.60*/.Assets.at("stylesheets/main.css"))),format.raw/*9.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq(/*10.59*/routes/*10.65*/.Assets.at("images/favicon.png"))),format.raw/*10.97*/("""">
        <script src=""""),_display_(Seq(/*11.23*/routes/*11.29*/.Assets.at("javascripts/jquery-1.7.1.min.js"))),format.raw/*11.74*/("""" type="text/javascript"></script>
    </head>
    <body>
        """),_display_(Seq(/*14.10*/content)),format.raw/*14.17*/("""
    </body>
</html>
"""))}
    }
    
    def render(title:String,content:Html) = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.Html) = (title) => (content) => apply(title)(content)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Feb 22 23:42:50 JST 2012
                    SOURCE: /Users/k2/git/PlayMongo/PlayMongo/app/views/main.scala.html
                    HASH: a13e9d4b43154b056c1fd04bda9e9b4e33b3c99e
                    MATRIX: 509->1|611->31|719->109|745->114|837->176|851->182|906->216|998->277|1013->283|1067->315|1123->340|1138->346|1205->391|1303->458|1332->465
                    LINES: 19->1|22->1|29->8|29->8|30->9|30->9|30->9|31->10|31->10|31->10|32->11|32->11|32->11|35->14|35->14
                    -- GENERATED --
                */
            