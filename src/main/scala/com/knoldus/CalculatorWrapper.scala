package com.knoldus

class CalculatorWrapper {

  private val calculator = new Calculator()

  def add(firstElement: Int, secondElement: Int): Int = calculator.add(firstElement, secondElement)

  def subtract(firstElement: Int, secondElement: Int): Int = calculator.subtract(firstElement, secondElement)

  def multiply(firstElement: Int, secondElement: Int): Int = calculator.multiply(firstElement, secondElement)

  def divide(firstElement: Int, secondElement: Int): Int = calculator.divide(firstElement, secondElement)
}
