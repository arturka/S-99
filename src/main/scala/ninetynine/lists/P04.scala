package ninetynine.lists

import scala.annotation.tailrec

object P04 {

    def length[T](list: List[T]): Int = list.length

    def lengthRec[T](list: List[T]): Int = {
        @tailrec
        def inner(length: Int = 0, curList: List[T] = list): Int = curList match {
            case Nil => length
            case x :: xs => inner(length + 1, xs)
        }

        inner()
    }
}