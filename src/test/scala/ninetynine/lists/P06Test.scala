package ninetynine.lists

import org.scalatest._

class P06Test extends FunSuite with Matchers {

    test("isPalindrome method should return true when list is a palindrome") {
        val listEven = List(1,2,3,3,2,1)
        val listOdd = List(1,2,3,4,3,2,1)
        
        P06.isPalindrome(listEven) shouldBe true
        P06.isPalindrome(listOdd) shouldBe true
        P06.isPalindrome(List.empty[Char]) shouldBe true
        P06.isPalindrome(List("string")) shouldBe true
    }

    test("isPalindrome method should return false when list is not a palindrome") {
        val listEven = List(1,2,3,4,2,1)
        val listOdd = List(1,2,3,5,5,2,1)

        P06.isPalindrome(listEven) shouldBe false
        P06.isPalindrome(listOdd) shouldBe false
    }
}