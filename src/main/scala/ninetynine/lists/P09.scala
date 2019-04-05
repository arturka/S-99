package ninetynine.lists

object P09 {

  def pack[A](list: List[A]): List[List[A]] =
    list.foldLeft(List(List.empty[A]))((acc, cur) => acc.last match {
      case x: List[A] if x.isEmpty || x.head == cur => acc.init :+ (x :+ cur)
      case _ => acc :+ List(cur)
    })
}