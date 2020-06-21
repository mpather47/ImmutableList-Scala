object main {
  val numbers: List[Int] = List(1,2,5,8,9,6,4);
  val names: List[String] = List("Jack","Black","Mack");

  def main(args: Array[String]): Unit ={
    println(0 :: numbers);
    println(numbers);
    println(names);
    println("Larry"::names);
    println(names.head);
    println(names.tail);
    println(numbers.head);
    println(numbers.reverse)
  }
}
