package ninetynine.arithmetic

import org.scalatest._
import P33._

class P33Test extends FunSuite with Matchers {

    (3, 4).isCoprimeTo shouldBe true
    (35, 42).isCoprimeTo shouldBe false
    (35, 64).isCoprimeTo shouldBe true
}