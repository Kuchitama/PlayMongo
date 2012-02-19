import models._

import org.specs2.mutable._
import org.specs2.mock._
import org.specs2.mock.mockito._
import org.specs2.specification._
import org.mockito.Matchers._

import play.api.test._
import play.api.test.Helpers._
import com.mongodb.casbah.Imports._

class TestApplication extends Specification with Mockito{
    val app = controllers.Application

    "The Application controller" should {
        "has browser's hasMap" in {
            val browsers = controllers.Application.browsers
            for ( (name, count) <- browsers) {
              count must equalTo(0)
            }
            browsers must have size(5)
        }
    }

    "The PlayMongo app" should {
    	"result must calculate user agent" in{
    		app.result
    		
    		val accessMock = mock[access]
    		
    	}
    }
    
    "The PlayMongo app" should {
        "render result template" in {
            val html = views.html.result(app.browsers)

            contentType(html) must equalTo("text/html")
            contentAsString(html) must contain("IE")
            contentAsString(html) must contain("FireFox")
            contentAsString(html) must contain("Chrome")
        }

        "send 404 on a bad request" in {
            running(FakeApplication()) {
                routeAndCall(FakeRequest(GET, "/foo")) must beNone

            }
        }
    }
}

// vim: set ts=4 sw=4 et:
