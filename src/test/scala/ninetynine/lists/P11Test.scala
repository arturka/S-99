package ninetynine.lists

import org.scalatest._

class P11Test extends FunSuite with Matchers {

  test("encodeModified shoul yield List of elements, where if element is single it's simply copied," +
    " elements with duplicates are transferred as (N, E) terms") {
      val list = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')

      P11.encodeModified(list) shouldBe List((4, 'a'), 'b', (2, 'c'), (2, 'a'), 'd', (4, 'e'))
    }
}