fun main() {
    println("Type an integer #1:")
    val first = readLine()!!.toInt()
    println("Type an integer #2:")
    val second = readLine()!!.toInt()
    println("$first + $second = ${first + second}")
    println("$first - $second = ${first - second}")
    println("$first * $second = ${first * second}")
}