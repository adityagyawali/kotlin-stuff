//Create a for loop that prints out the following numbers: 5 10 15 20 25 30 35 40 45 50. Note! Use range and step.
//fun main() {
//    for (i in (5..50) step 5) {
//        println(i)
//    }
//}

/*

Create a program that calculates the factorial number (n!) of the given integer. For example, 5! = 1 * 2 * 3 * 4 * 5 = 120

Example output:
Type an integer:
14
The factorial of 14 = 1278945280
The output of the program must be exactly the same as the example output (the most strict comparison level)
 */

//fun main() {
//    println("Type an integer:")
//    val input = readLine()!!.toInt()
//    var factorial = 1
//    for (i in (1..input)) {
//        factorial *= i
//    }
//    println("The factorial of $input = $factorial")
//}

/*
Create an array with the following values: 11, 16, 7, 8, 14, 5, 9, 3. The program calculates the average of the numbers in the array. Note! The average is floating point number.

Example output:
Average = 9.125
The verification of program output does not account for whitespace characters like "\n", "\t" and " "
 */


//fun main() {
//    val arrayOfNum = arrayOf(11, 16, 7, 8, 14, 5, 9, 3)
//    val avg = arrayOfNum.average()
//    println("Average = $avg")
//}

/*
Create a program that prints the following pattern using the nested loops.

Example output:
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
6 6 6 6 6 6
7 7 7 7 7 7 7
8 8 8 8 8 8 8 8
9 9 9 9 9 9 9 9 9
10 10 10 10 10 10 10 10 10 10

 */
//fun main() {
//    for (i in 1..10) {
//        for (j in 1..i) {
//            print("$i ")
//        }
//        println()
//    }
//}

/*
Create a program that ask user to type words. The program execution stops when a user types letter 'x'. Finally, program prints the number of words.

Example output:
Type a word (Type x to exit)
Hello
Type a word (Type x to exit)
Kotlin
Type a word (Type x to exit)
Viope
Type a word (Type x to exit)
x
You typed 3 words

 */

fun main() {
    var input = " "
    val list: MutableList<String> = ArrayList()

    while (input.lowercase() != "x") {
        println("Type a word (Type x to exit)")
        input = readLine()!!

        if(input.lowercase() != "x") // this one so that we don't add it to the list
            list.add(input)
    }
    println("You typed ${list.size} words")
}