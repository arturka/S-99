package ninetynine.lists

object P12 {

  def decode[A](list: List[(Int, A)]): List[A] = 
    list.foldLeft(List.empty[A]){ case (acc, (n, el)) => 
        acc ::: List.fill(n)(el)
    }
}