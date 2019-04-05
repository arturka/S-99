package ninetynine.lists

import org.scalatest._

class P09Test extends FunSuite with Matchers {

  test("pack method should pack consecutive duplicates into list") {
    val list = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')

    P09.pack(list) shouldBe List(
                              List('a', 'a', 'a', 'a'), 
                              List('b'), 
                              List('c', 'c'), 
                              List('a', 'a'), 
                              List('d'), 
                              List('e', 'e', 'e', 'e'))
  }

	test("pack method should yield an empty list on empty input") {
		P09.pack(List.empty[Int]) shouldBe List(List.empty[Int])
	}
}