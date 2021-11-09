package edu.knoldus
import org.scalatest.funsuite.AnyFunSuite

class StackTest extends AnyFunSuite {

  val result = new Stack[Int]
  test("testing the element in stack"){
    //testing push operation
    println(result.push(1))
    println(result.push(2))

    //testing top operation
    println(result.top)

    //testing pop operation
    println(result.pop())  //prints 2
    println(result.pop())  //prints 1

    //testing ISempty operation
    println(result.isEmpty)

  }






}
