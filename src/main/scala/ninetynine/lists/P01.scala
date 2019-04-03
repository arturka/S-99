package ninetynine.lists

import java.util.NoSuchElementException

import scala.annotation.tailrec

object P01 {

    def last[T](list: List[T]): T = list.last

    @tailrec
    def lastRec[T](list: List[T]): T = list match {
        case Nil => throw new NoSuchElementException()
        case x :: Nil =>  x
        case x :: xs => lastRec(xs)
    }
}