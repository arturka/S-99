package ninetynine.lists

import org.scalatest._

class P05Test extends FunSuite with Matchers {

    test("builtin reverse should reverse initial list") {
        val list = List(1,2,3,4,5,6)
        val emptyList = List.empty[Char]

        P05.reverse(list) shouldBe List(6,5,4,3,2,1)
        P05.reverse(emptyList) shouldBe List.empty[Char]
    }

    test("reverse implementation should reverse initial list") {
        val list = List(1,2,3,4,5,6)
        val emptyList = List.empty[Char]

        P05.reverseImpl(list) shouldBe List(6,5,4,3,2,1)
        P05.reverseImpl(emptyList) shouldBe List.empty[Char]
    }

    test("reverse func implementation should reverse initial list") {
        val list = List(1,2,3,4,5,6)
        val emptyList = List.empty[Char]

        P05.reverseFunc(list) shouldBe List(6,5,4,3,2,1)
        P05.reverseFunc(emptyList) shouldBe List.empty[Char]
    }
}