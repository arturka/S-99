package ninetynine.lists

object P07 {

    def flatten(list: List[Any]): List[Any] = {
        def inner(acc: List[Any], curList: List[Any]): List[Any] = curList match {
            case Nil => acc
            case (x: List[Any]) :: xs => inner(inner(acc, x), xs)
            case x :: xs => inner(acc :+ x, xs)
        }

        inner(List.empty[Any], list)
    }
}