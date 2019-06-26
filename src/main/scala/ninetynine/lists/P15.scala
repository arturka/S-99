package ninetynine.lists

object P15 {

    def duplicateN[T](times: Int, l: List[T]): List[T] = {
        l.flatMap(List.fill(times)(_))

        // def inner(n: Int, list: List[T], acc: List[T]): List[T] = list match {
        //     case Nil => acc
        //     case x :: xs => inner(n, xs, acc ::: List.fill(n)(x))
        // }

        // inner(times, l, List.empty[T])
    }
}