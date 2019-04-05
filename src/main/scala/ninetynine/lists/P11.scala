package ninetynine.lists

object P11 {

  import P09._

  def encodeModified[A](list: List[A]): List[Any] =
    pack(list).map(x => {
        if (x.length > 1) (x.length, x.head)
        else x.head
    })

}