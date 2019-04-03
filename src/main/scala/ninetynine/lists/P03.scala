package ninetynine.lists

object P03 {

    def nth[T](n: Int, list: List[T]): T = list(n)

    def nthRec[T](n: Int, list: List[T]): T = list match {
        case Nil => throw new IndexOutOfBoundsException()
        case _ if n < 0 => throw new IndexOutOfBoundsException()
        case _ :: xs if n > 0 => nthRec(n - 1, xs)
        case x :: _ if n == 0 => x
    }
}