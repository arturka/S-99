package ninetynine.arithmetic

trait IsCoprimeable[A] {
    def isCoprimeTo(a: A, b: A): Boolean
}

object P33 {

    implicit val intIsCoprimable: IsCoprimeable[Int] = (a: Int, b: Int) => P32.gcd(a, b) == 1

    implicit class IsCoprimeableOps[A](pair: (A, A)) {
        def isCoprimeTo(implicit ic: IsCoprimeable[A]): Boolean = ic.isCoprimeTo(pair._1, pair._2)
    }
}