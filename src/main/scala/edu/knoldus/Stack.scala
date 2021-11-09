package edu.knoldus

import scala.util.{Failure, Success, Try}

class Stack[A] extends scala[A] {

  def push(x: A): List[A] = {
    elems = x :: elems
    elems
  }

  def top : Try[A] = {
    if (elems==0) {
      Failure(new NoSuchElementException("Empty Stack"))
    } else Success(elems.head)
  }

  def peek: A = elems.head
  def pop(): A = {
    val currentTop = peek
    elems = elems.tail
    currentTop
  }

  def isEmpty : Boolean = elems.isEmpty
}