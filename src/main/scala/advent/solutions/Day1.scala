package advent.solutions

/** Day 1: The Tyranny of the Rocket Equation
  *
  * @see https://adventofcode.com/2019/day/1
  */
object Day1 {

  object Part1 {

    /** Calculates the fuel required to launch a module of a given mass
      *
      * @param mass The mass of the module
      * @return The fuel required to to launch the module
      */
    def fuel(mass: Int): Int = {
      mass / 3 - 2
    }

    /** Calculates the sum of the fuel required to launch each module of a given mass
      *
      * @param masses The masses of each module
      * @return The sum of the fuel required to launch each module
      */
    def sumOfFuel(masses: List[Int]): Int = {
      masses.map(fuel).fold(0)(_ + _)
    }

    // Use the two functions below to complete the exercise
    // private def calculateFuels(
    //     masses: List[Int]
    // ): List[Int] = {
    //   ???
    // }

    // private def sumFuels(
    //     fuels: List[Int]
    // ): Int = {
    //   ???
    // }
  }

  object Part2 {

    /** Calculates the total required to launch a module, including the fuel required to launch the fuel itself
      *
      * @param mass The mass of the module
      * @return The fuel required to launch the module, plus the fuel required to launch that fuel
      */
    def totalFuel(mass: Int): Int = {
      ???
    }

    /** Calculates the sum of the total fuel required to launch each module of a given mass
      *
      * @param masses The masses of each module
      * @return The sum of the total fuel required to launch each module
      */
    def sumOfTotalFuel(
        masses: List[Int]
    ): Int = {
      ???
    }
  }

  // scalastyle:off
  @SuppressWarnings(Array("org.wartremover.warts.All"))
  def main(args: Array[String]): Unit = {

    // Copy the puzzle input from https://adventofcode.com/2019/day/1/input
    val puzzleInput: List[Int] = Nil

    // Solve your puzzle using the functions in parts 1 and 2
    val part1 = Part1.sumOfFuel(puzzleInput)
    println(part1)
  }
  // scalastyle:on
}
