
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
object result extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[scala.collection.mutable.HashMap[String, Int],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(results: scala.collection.mutable.HashMap[String, Int]):play.api.templates.Html = {
        _display_ {import scala.collection.mutable.HashMap


Seq(format.raw/*1.58*/("""
"""),format.raw/*3.1*/("""
"""),_display_(Seq(/*4.2*/main("Browser Result")/*4.24*/ {_display_(Seq(format.raw/*4.26*/("""
<table>
	<thead>
		<th>Browser</th>
		<th>Count</th>
	</thead>
"""),_display_(Seq(/*10.2*/for(browser <- results) yield /*10.25*/{_display_(Seq(format.raw/*10.26*/("""
<tr>
	<td>"""),_display_(Seq(/*12.7*/browser/*12.14*/._1)),format.raw/*12.17*/("""</td>
	<td>"""),_display_(Seq(/*13.7*/browser/*13.14*/._2)),format.raw/*13.17*/("""</td>
</tr>
""")))})),format.raw/*15.2*/("""
</table>
""")))})),format.raw/*17.2*/("""
"""))}
    }
    
    def render(results:scala.collection.mutable.HashMap[String, Int]) = apply(results)
    
    def f:((scala.collection.mutable.HashMap[String, Int]) => play.api.templates.Html) = (results) => apply(results)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Feb 20 00:42:16 JST 2012
                    SOURCE: /Users/k2/ProgramProjects/Scala/PlayMongo/app/views/result.scala.html
                    HASH: cb28354c51ddf1714c6fb18c3f321279539b42c5
                    MATRIX: 545->1|713->57|740->99|771->101|801->123|835->125|930->190|969->213|1003->214|1045->226|1061->233|1086->236|1128->248|1144->255|1169->258|1213->271|1255->282
                    LINES: 19->1|23->1|24->3|25->4|25->4|25->4|31->10|31->10|31->10|33->12|33->12|33->12|34->13|34->13|34->13|36->15|38->17
                    -- GENERATED --
                */
            