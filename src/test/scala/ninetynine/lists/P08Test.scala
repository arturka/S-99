package ninetynine.lists

import org.scalatest._

class P08Test extends FunSuite with Matchers {

    test("compress should remove consecutive duplicates") {
        val list = List(1,1,1,1,2,2,3,3,1,1,4,5,5)

        P08.compress(list) shouldBe List(1,2,3,1,4,5)
    }

    test("compress on an empty list should yield an empty list") {
        P08.compress(List.empty[Char]) shouldBe List.empty[Char]
    }
}