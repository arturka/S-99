package ninetynine.lists

import org.scalatest._

class P02Test extends FunSuite with Matchers {

    test("List builtin penultimate method should find last but one elements of different types") {
        val lastInt = P02.penultimate(List(1,2,3,4,5,6))
        val lastString = P02.penultimate(List("1","2","3","4","5","6"))
        val lastChar = P02.penultimate(List('1','2','3','4','5','6'))

        lastInt shouldBe 5
        lastString shouldBe "5"
        lastChar shouldBe '5'
    }

    test("List builtin penultimate method should yield an UnsupportedOperationException on an empty List") {
        an[UnsupportedOperationException] should be thrownBy { P02.penultimate(List.empty[Int]) }
    }

    test("List builtin penultimate method should yield a NoSuchElementException on a List with one element") {
        an[NoSuchElementException] should be thrownBy { P02.penultimate(List(1)) }
    }

    test("recursive implementation of penultimate should yield last elements of different types") {
        val lastInt = P02.penultimateRec(List(1,2,3,4,5,6))
        val lastString = P02.penultimateRec(List("1","2","3","4","5","6"))
        val lastChar = P02.penultimateRec(List('1','2','3','4','5','6'))

        lastInt shouldBe 5
        lastString shouldBe "5"
        lastChar shouldBe '5'
    }

    test("recursive implementation of penultimate should yield an UnsupportedOperationException on an empty List") {
        an[UnsupportedOperationException] should be thrownBy { P02.penultimateRec(List.empty[Int]) }
    }

    test("recursive implementation of penultimate should yield a NoSuchElementException on a List with one element") {
        an[NoSuchElementException] should be thrownBy { P02.penultimateRec(List(1)) }
    }
}