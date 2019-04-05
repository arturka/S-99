package ninetynine.lists

import org.scalatest._

class P12Test extends FunSuite with Matchers {

    test("decode method should uncompress result of P10 encode method") {
        val list = List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))

        P12.decode(list) shouldBe List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    }
}