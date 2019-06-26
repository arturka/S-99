package ninetynine.lists

import org.scalatest._

class P15Test extends FunSuite with Matchers {

    test("duplicateN should return list with each element repeated N times in order") {
        val list = List('a, 'b, 'c, 'c, 'd)
        
        P15.duplicateN(3, list) shouldBe List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
    }
} 