package ninetynine.lists

object P10 {

  import P09._

  def encode[A](list: List[A]): List[(Int, A)] = 
      pack(list).map(x => (x.length, x.head))
}