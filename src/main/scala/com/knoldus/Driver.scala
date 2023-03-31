import scala.util.{Try, Success, Failure}
import com.knoldus._

object Driver extends App {

  private val calculator = new Calculator()
  //all arithmetic operations performed through instance of CalculatorWrapper class
  println(Try(calculator.add(5, 10)) match {
    case Success(result) => s"Result of addition: $result"
    case Failure(exception) => s"Failed to add: ${exception.getMessage}"
  })
  println(Try(calculator.subtract(10, 5)) match {
    case Success(result) => s"Result of subtraction: $result"
    case Failure(exception) => s"Failed to subtract: ${exception.getMessage}"
  })
  println(Try(calculator.multiply(5, 5)) match {
    case Success(result) => s"Result of multiplication: $result"
    case Failure(exception) => s"Failed to multiply: ${exception.getMessage}"
  })
  println(Try(calculator.divide(10, 2)) match {
    case Success(result) => s"Result of division: $result"
    case Failure(exception) => s"Failed to divide: ${exception.getMessage}"
  })

  //instance of the Storage class to perform storage operations, all functions implemented successfully
  private val storageObject = new Storage
  Try(storageObject.addElement(2)) match {
    case Success(_) => println("Element added successfully")
    case Failure(exception) => println(s"Failed to add element: ${exception.getMessage}")
  }
  Try(storageObject.removeElement(2)) match {
    case Success(_) => println("Element removed successfully")
    case Failure(exception) => println(s"Failed to remove element: ${exception.getMessage}")
  }
  println(Try(storageObject.checkIfContains(2)) match {
    case Success(result) => s"Contains element: $result"
    case Failure(exception) => s"Failed to check if element is contained: ${exception.getMessage}"
  })
  Try(storageObject.removeAll()) match {
    case Success(_) => println("All elements removed successfully")
    case Failure(exception) => println(s"Failed to remove all elements: ${exception.getMessage}")
  }
}
