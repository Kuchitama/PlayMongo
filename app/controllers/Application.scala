package controllers

import play.api._
import play.api.mvc._
import models._
import com.mongodb.casbah.Imports._
import scala.collection.mutable.HashMap
import scala.collection.mutable.HashSet

object Application extends Controller {
  val browsers = HashMap[String, Int]("IE" -> 0, "FireFox" -> 0, "Chrome" -> 0, "Safari" -> 0, "Other" -> 0) 
    var ips = List[Any]();
  
  def index = Action {
    Ok(views.html.index("ほげほげ"))
  }
  
  def result = Action {
    val accesses = access.findAll;
    for (access_log <- accesses if !ips.contains(access_log.get("host"))) {
      ips = access_log.get("host")::ips;

      val userAgent:String = access_log.get("agent").toString;
      println("LOG:" + userAgent);
      if ( userAgent.contains("MSIE")) browsers.put("IE", browsers("IE")+1)
      else if ( userAgent.contains("FireFox"))
        browsers.put("FireFox", browsers("FireFox") + 1)
      else if ( userAgent.contains("Chrome")) browsers.put("Chrome",browsers("Chrome") + 1)
      else if ( userAgent.contains("Safari")) browsers.put("Safari",browsers("Safari") + 1)
      else browsers.put("Others", browsers("Others") + 1)
    }

    Ok(views.html.result(browsers))
  }

  def add(host : String,  agent: String) = Action {
    access.save(MongoDBObject("host"->host, "agent"->agent))
    
    Ok("Saved host:" + host)
  }

  def showAll = Action {
    val savedColls = access.findAll

    Ok(views.html.index("ほげほげ"))
  }
}
