// @SOURCE:/Users/k2/ProgramProjects/Scala/PlayMongo/conf/routes
// @HASH:362684aeabf7cb8e84d1719fd8992d1d46ae50d2
// @DATE:Sun Feb 12 16:38:07 JST 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString

object Routes extends Router.Routes {


// @LINE:6
val controllers_Assets_at0 = Route("GET", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    

// @LINE:9
val controllers_Application_index1 = Route("GET", PathPattern(List(StaticPart("/"))))
                    

// @LINE:10
val controllers_Application_result2 = Route("GET", PathPattern(List(StaticPart("/result"))))
                    

// @LINE:11
val controllers_Application_add3 = Route("GET", PathPattern(List(StaticPart("/add/"),DynamicPart("host", """[^/]+"""),StaticPart("/"),DynamicPart("agent", """[^/]+"""))))
                    
def documentation = List(("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""","""/""","""controllers.Application.index"""),("""GET""","""/result""","""controllers.Application.result"""),("""GET""","""/add/$host<[^/]+>/$agent<[^/]+>""","""controllers.Application.add(host:String, agent:String)"""))
             
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Assets_at0(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    

// @LINE:9
case controllers_Application_index1(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.index, HandlerDef(this, "controllers.Application", "index", Nil))
   }
}
                    

// @LINE:10
case controllers_Application_result2(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.result, HandlerDef(this, "controllers.Application", "result", Nil))
   }
}
                    

// @LINE:11
case controllers_Application_add3(params) => {
   call(params.fromPath[String]("host", None), params.fromPath[String]("agent", None)) { (host, agent) =>
        invokeHandler(_root_.controllers.Application.add(host, agent), HandlerDef(this, "controllers.Application", "add", Seq(classOf[String], classOf[String])))
   }
}
                    
}
    
}
                