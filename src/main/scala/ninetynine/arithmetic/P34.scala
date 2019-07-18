package ninetynine.arithmetic

import P33._

object P34 {

    def totient(n: Int): Int = {
        (1 to n).filter(x => (x, n).isCoprime).size
    }
}