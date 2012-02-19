import org.specs2.mock._
import org.specs2.mock.mockito._
import org.specs2.mutable.Specification
import org.mockito.Matchers._
//import org.mockito.Mockito

import play.api.test._
import play.api.test.Helpers._

object TestMock extends Specification with Mockito{
	"hoge" should {
		"fuga" in {
			val m = mock[java.util.List[String]]

			m.get(0) returns ""
			//one must equalTo("one")
			true
		}
	}
}