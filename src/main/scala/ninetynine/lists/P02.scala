package ninetynine.lists

import java.util.NoSuchElementException

import scala.annotation.tailrec

object P02 {

    // original solution:                  list.init.last
    def penultimate[T](list: List[T]): T = list.reverse.tail.head

    @tailrec
    def penultimateRec[T](list: List[T]): T = list match {
        case Nil => throw new UnsupportedOperationException()
        case x :: Nil =>  throw new NoSuchElementException()
        case x :: xx :: Nil => x
        case x :: xx :: xs => penultimateRec(xs)
    }
}