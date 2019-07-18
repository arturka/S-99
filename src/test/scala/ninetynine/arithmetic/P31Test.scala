package ninetynine.arithmetic

import org.scalatest._
import P31._

class P31Test extends FunSuite with Matchers {

    (-1231).isPrime shouldBe false
    0.isPrime
    4.isPrime shouldBe false
    5.isPrime shouldBe true
    10394201.isPrime shouldBe false
    10000000.isPrime shouldBe false
    10394202.isPrime shouldBe false
    10394227.isPrime shouldBe true
}