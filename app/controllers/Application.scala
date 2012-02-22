package controllers

import play.api._
import play.api.mvc._
import models._
import com.mongodb.casbah.Imports._
import scala.collection.mutable.HashMap
import scala.collection.mutable.HashSet

object Application extends Controller {
  val browsers = HashMap[String, Int]("IE" -> 0, "Firefox" -> 0, "Chrome" -> 0, "Safari" -> 0, "Others" -> 0) 
    var ips = List[Any]();
  
  def index = Action {
    Ok(views.html.index("ほげほげ"))
  }
  
  def result = Action {
    val accesses = Access.findAll;
    for (access_log <- accesses if !ips.contains(access_log.get("host"))) {
      ips = access_log.get("host")::ips;

      val userAgent:String = access_log.get("agent").toString;
      
      userAgent match { 
	      case ua if ua.contains("MSIE") => browsers.put("IE", browsers("IE") + 1)
	      case ua if ua.contains("Firefox") => browsers.put("Firefox", browsers("Firefox") + 1)
	      case ua if ua.contains("Chrome") => browsers.put("Chrome", browsers("Chrome") + 1)
	      case ua if ua.contains("Safari") => browsers.put("Safari", browsers("Safari") + 1)
	      case _ => browsers.put("Others", browsers("Others") + 1)
      }
    }

    Ok(views.html.result(browsers))
  }

  def add(host : String,  agent: String) = Action {
    Access.save(MongoDBObject("host"->host, "agent"->agent))
    
    Ok("Saved host:" + host)
  }

  def showAll = Action {
    val savedColls = Access.findAll

    Ok(views.html.index("ほげほげ"))
  }
}
