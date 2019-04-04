package ninetynine.lists

import org.scalatest._

class P07Test extends FunSuite with Matchers {

    test("flatten method should flatten list with inner lists") {
        val list = List(List(1,2,3), 4,5, List(List(6), List(7, List(8))))

        P07.flatten(list) shouldBe List(1,2,3,4,5,6,7,8)
        P07.flatten(List.empty[Any]) shouldBe List.empty[Any]
    }
}