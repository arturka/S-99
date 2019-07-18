package ninetynine.arithmetic

import org.scalatest._
import P33._

class P33Test extends FunSuite with Matchers {

    (3, 4).isCoprime shouldBe true
    (35, 42).isCoprime shouldBe false
    (35, 64).isCoprime shouldBe true
}