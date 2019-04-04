package ninetynine.lists

import scala.annotation.tailrec

object P05 {

    def reverse[T](list: List[T]): List[T] = list.reverse

    def reverseImpl[T](list: List[T]): List[T] = {
        @tailrec
        def inner(result: List[T], curList: List[T]): List[T] = curList match {
            case Nil => result
            case x :: xs => inner(x +: result, xs)
        }

        inner(List.empty[T], list)
    }

    def reverseFunc[T](list: List[T]): List[T] = 
      list.foldRight(List.empty[T])((x, acc) => acc :+ x)
}