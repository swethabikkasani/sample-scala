import scala.io.StdIn.readLine

object helloInteractive {

  def main(args: Array[String]) = {
    println("Hello from Scala!")
    println("Please enter your name:")
    val name = readLine()

    println("Hi, " + name + "!" + "\nWelcome to the world of Scala")
  }

}
