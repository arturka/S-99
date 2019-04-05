package ninetynine.lists

object P08 {
    
    def compress[A](list: List[A]): List[A] = {
        def inner(curList: List[A], acc: List[A]): List[A] = curList match {
            case Nil => acc
            case x :: xs if acc.last != x => inner(xs, acc :+ x)
            case _ :: xs => inner(xs, acc)
        }

        list match {
            case Nil => Nil
            case x :: xs => inner(xs, List(x))
        }
    }
}