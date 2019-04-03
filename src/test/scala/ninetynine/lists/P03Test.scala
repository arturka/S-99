package ninetynine.lists

import org.scalatest._

class P03Test extends FunSuite with Matchers {

    test("built nth element on an empty List should throw an IndexOutOfBoundsException") {
        an[IndexOutOfBoundsException] should be thrownBy { P03.nth(3, List.empty[Int]) }
    }

    test("recursive nth element on an empty List should throw an IndexOutOfBoundsException") {
        an[IndexOutOfBoundsException] should be thrownBy { P03.nthRec(3, List.empty[Int]) }
    }

    test("built nth element on an empty List should throw an IndexOutOfBoundsException 2") {
        an[IndexOutOfBoundsException] should be thrownBy { P03.nth(-2, List.empty[Int]) }
    }

    test("recursive nth element on an empty List should throw an IndexOutOfBoundsException 2") {
        an[IndexOutOfBoundsException] should be thrownBy { P03.nthRec(-2, List.empty[Int]) }
    }

    test("build nth element on a List with size smaller than n should yield IndexOutOfBoundsException") {
        an[IndexOutOfBoundsException] should be thrownBy { P03.nth(5, List(1,2,3)) }
    }

    test("recursive nth element on a List with size smaller that n should yield IndexOutOfBoundsException") {
        an[IndexOutOfBoundsException] should be thrownBy { P03.nthRec(5, List(1,2,3)) }
    }

    test("build nth should yield nth element of a non empty List") {
        val list = List(1,2,3,4,5)

        P03.nth(3, list) shouldBe 4
    }

    test("recursive nth should yield nth element of a non empty List") {
        val list = List(1,2,3,4,5)

        P03.nthRec(3, list) shouldBe 4
    }
}