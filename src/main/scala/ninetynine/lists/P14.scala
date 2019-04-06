package ninetynine.lists

object P14 {
    
    def duplicate[A](list: List[A]): List[A] = {
        def inner(curList: List[A], acc: List[A]): List[A] = curList match {
            case Nil => acc
            case x :: xs => inner(xs, acc ::: List(x, x))
        }

        inner(list, List.empty[A])
    }
}