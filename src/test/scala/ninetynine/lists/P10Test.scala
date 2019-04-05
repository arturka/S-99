package ninetynine.lists

import org.scalatest._

class P10Test extends FunSuite with Matchers {

  test("encode should transfer elements with duplicates as (N, E) terms") {
      val list = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')

      P10.encode(list) shouldBe List((4, 'a'), (1, 'b'), (2, 'c'), (2, 'a'), (1, 'd'), (4, 'e'))
  }
}