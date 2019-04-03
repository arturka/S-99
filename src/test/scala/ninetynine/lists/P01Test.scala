package ninetynine.lists

import org.scalatest._

class P01Test extends FunSuite with Matchers {

    test("List builtin method should find last elements of different types") {
        val lastInt = P01.last(List(1,2,3,4,5,6))
        val lastString = P01.last(List("1","2","3","4","5","6"))
        val lastChar = P01.last(List('1','2','3','4','5','6'))

        lastInt shouldBe 6
        lastString shouldBe "6"
        lastChar shouldBe '6'
    }

    test("List builtin method should yield a NoSuchElementException on an empty List") {
        an[NoSuchElementException] should be thrownBy { P01.last(List.empty[Int]) }
    }

    test("recursive implementation should yield last elements of different types") {
        val lastInt = P01.lastRec(List(1,2,3,4,5,6))
        val lastString = P01.lastRec(List("1","2","3","4","5","6"))
        val lastChar = P01.lastRec(List('1','2','3','4','5','6'))

        lastInt shouldBe 6
        lastString shouldBe "6"
        lastChar shouldBe '6'
    }

    test("recursive implementation should yield a NoSuchElementException on an empty List") {
        an[NoSuchElementException] should be thrownBy { P01.lastRec(List.empty[Int]) }
    }
}