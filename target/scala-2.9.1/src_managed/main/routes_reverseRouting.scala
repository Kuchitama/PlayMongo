// @SOURCE:/Users/k2/git/PlayMongo/PlayMongo/conf/routes
// @HASH:362684aeabf7cb8e84d1719fd8992d1d46ae50d2
// @DATE:Wed Feb 22 23:42:49 JST 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers {

// @LINE:6
class ReverseAssets {
    


 
// @LINE:6
def at(file:String) = {
   Call("GET", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                        

                      
    
}
                            

// @LINE:11
// @LINE:10
// @LINE:9
class ReverseApplication {
    


 
// @LINE:11
def add(host:String, agent:String) = {
   Call("GET", "/add/" + implicitly[PathBindable[String]].unbind("host", host) + "/" + implicitly[PathBindable[String]].unbind("agent", agent))
}
                                                        
 
// @LINE:9
def index() = {
   Call("GET", "/")
}
                                                        
 
// @LINE:10
def result() = {
   Call("GET", "/result")
}
                                                        

                      
    
}
                            
}
                    


// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:6
class ReverseAssets {
    


 
// @LINE:6
def at = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:11
// @LINE:10
// @LINE:9
class ReverseApplication {
    


 
// @LINE:11
def add = JavascriptReverseRoute(
   "controllers.Application.add",
   """
      function(host,agent) {
      return _wA({method:"GET", url:"/add/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("host", host) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("agent", agent)})
      }
   """
)
                                                        
 
// @LINE:9
def index = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"/"})
      }
   """
)
                                                        
 
// @LINE:10
def result = JavascriptReverseRoute(
   "controllers.Application.result",
   """
      function() {
      return _wA({method:"GET", url:"/result"})
      }
   """
)
                                                        

                      
    
}
                            
}
                    


// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.ref {

// @LINE:6
class ReverseAssets {
    


 
// @LINE:6
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            

// @LINE:11
// @LINE:10
// @LINE:9
class ReverseApplication {
    


 
// @LINE:11
def add(host:String, agent:String) = new play.api.mvc.HandlerRef(
   controllers.Application.add(host, agent), HandlerDef(this, "controllers.Application", "add", Seq(classOf[String], classOf[String]))
)
                              
 
// @LINE:9
def index() = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq())
)
                              
 
// @LINE:10
def result() = new play.api.mvc.HandlerRef(
   controllers.Application.result(), HandlerDef(this, "controllers.Application", "result", Seq())
)
                              

                      
    
}
                            
}
                    
                