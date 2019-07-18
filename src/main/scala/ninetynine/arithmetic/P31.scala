package ninetynine.arithmetic

// class S99Int(val start: Int) {
//   def isPrime: Boolean =
//     (start > 1) && (primes takeWhile { _ <= Math.sqrt(start) } forall { start % _ != 0 })
// }

// object S99Int {
//   val primes = Stream.cons(2, Stream.from(3, 2) filter { _.isPrime })
// }

trait Primeable[A] {
    def isPrime(number: A): Boolean
}

object P31 {

    implicit class PrimeOps[A](a: A) {
        def isPrime(implicit primeable: Primeable[A]) = primeable.isPrime(a)
    }

    implicit val intPrimeable: Primeable[Int] = 
        (number: Int) => {
            if (number <= 0) false
            else if (number == 1) true
            else {
                var s: Boolean = true
                for (x <- 2 to Math.sqrt(number).toInt) {
                    if (number % x == 0) s = false 
                }
                s
            }
        }
}