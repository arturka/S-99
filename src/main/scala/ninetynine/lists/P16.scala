package ninetynine.lists

object P16 {
    def drop[T](n: Int, l: List[T]): List[T] = {
        def inner(cur: Int, result: List[T], list: List[T]): List[T] = list match {
            case Nil => result
            case x :: xs if cur - 1 == 0 => inner(n, result, xs)
            case x :: xs => inner(cur - 1, result :+ x, xs)
        }

        inner(n, List.empty[T], l)
    }
}