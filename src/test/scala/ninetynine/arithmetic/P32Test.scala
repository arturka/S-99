package ninetynine.arithmetic

import org.scalatest._

class P32Test extends FunSuite with Matchers {

    P32.gcd(35, 42) shouldBe 7
    P32.gcd(63, 36) shouldBe 9
}