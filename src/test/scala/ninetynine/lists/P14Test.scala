package ninetynine.lists 

import org.scalatest._

class P14Test extends FunSuite with Matchers {

    test("duplicate should duplicate elements") {
        val list = List(1,2,3,4,5)

        P14.duplicate(list) shouldBe List(1,1,2,2,3,3,4,4,5,5)
    }
}