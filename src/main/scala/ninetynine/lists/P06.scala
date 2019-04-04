package ninetynine.lists

import scala.annotation.tailrec

object P06 {

    // original solution:
    // def isPalindrome[T](ls: List[A]): Boolean = ls == ls.reverse
    @tailrec
    def isPalindrome[T](list: List[T]): Boolean = list match {
        case Nil => true
        case x :: Nil => true
        case xs if xs.head == xs.last => isPalindrome(xs.init.tail)
        case _ => false
    }
}