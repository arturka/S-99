package ninetynine.lists

import org.scalatest._

class P16Test extends FunSuite with Matchers {

    test("drop should Drop every Nth element from a list") {
        val list = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)

        P16.drop(3, list) shouldBe List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
    }
}