package ninetynine.arithmetic

import org.scalatest._

class P34Test extends FunSuite with Matchers {

    test("should return count of Coprime numbers between 1 and given number") {
        P34.totient(10) shouldBe 4
        P34.totient(235) shouldBe 184
        P34.totient(1) shouldBe 1
    }
}