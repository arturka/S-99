package ninetynine.lists

import org.scalatest._

class P04Test extends FunSuite with Matchers {

    test("list builtin length method should work") {
        val list = List(1,2,3,4,5,6)
        val listEmpty = List.empty[String]

        P04.length(list) shouldBe 6
        P04.length(listEmpty) shouldBe 0
    }

    test("list recursive length method should work") {
        val list = List(1,2,3,4,5,6)
        val listEmpty = List.empty[String]

        P04.lengthRec(list)
        P04.lengthRec(listEmpty)
    }
}