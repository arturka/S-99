package ninetynine.arithmetic

object P32 {

    def gcd(a: Int, b: Int): Int = {
        if (a == 0 || b == 0) a + b
        else gcd(b, a % b)
    }
}