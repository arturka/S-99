package ninetynine.arithmetic

trait IsCoprimeable[A] {
    def isCoprime(a: A, b: A): Boolean
}

object P33 {

    implicit val intIsCoprimable: IsCoprimeable[Int] = (a: Int, b: Int) => P32.gcd(a, b) == 1

    implicit class IsCoprimeableOps[A](pair: (A, A)) {
        def isCoprime(implicit ic: IsCoprimeable[A]): Boolean = ic.isCoprime(pair._1, pair._2)
    }
}