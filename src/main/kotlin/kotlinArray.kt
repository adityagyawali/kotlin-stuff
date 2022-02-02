import java.util.*

//Create Kotlin program that asks user to type string and then it checks if the typed string is palindrome (same in the reversed order). The program is not case sensitive.


//fun main() {
//    println("Type a word:\n")
//    val word = readLine()!!
//    val reverseWord = word.reversed()
//    if(word.equals(reverseWord, true)) {
//        println("The word rotator is palindrome")
//    }
//}

//Create Kotlin program that read three integers from the keyboard. The program prints the largest number to the screen.


//fun main() {
//    println("Type the first number:")
//    val num1 = readLine()!!.toInt()
//    println("Type the second number:")
//    val num2 = readLine()!!.toInt()
//    println("Type the third number:")
//    val num3 = readLine()!!.toInt()
//
//    var maxNum = 0
//
//    maxNum = if (num1 > num2) {
//        num1
//    } else {
//        num2
//    }
//
//    maxNum = if (maxNum < num3) {
//        num3
//    } else {
//        maxNum
//    }
//    println("The largest number = $maxNum")
//}

//Create Kotlin program that asks month number and prints the correct month name using the when. Use Java Scanner class for the user input.




//fun main() {
//    val input = Scanner(System.`in`)
//    println("Type a month number (1-12)")
//
//    val month =  when(input.nextInt()) {
//        1 -> "January"
//        2 -> "February"
//        3 -> "March"
//        4 -> "April"
//        5 -> "May"
//        6 -> "June"
//        7 -> "July"
//        8 -> "August"
//        9 -> "September"
//        10 -> "October"
//        11 -> "November"
//        12 -> "December"
//       else -> "Unknown"
//    }
//
//    println(month)
//}

//Create a calculator that ask two integers and an operator (+, - or *). The program then calculates the result using the typed operator. You have to use Java Scanner class and the when conditional statement in this exercise.

/*
    Type the first number:
    5
    Type the second number:
    12
    Type the operator (+,-,*):
    +
    5 + 12 = 17
*/

fun main() {
    val input = Scanner(System.`in`)
    println("Type the first number:")
    val firstNum = input.nextInt()
    println("Type the second number:")
    val secondNum = input.nextInt()
    println("Type the operator (+,-,*):")
    val operator = input.next()[0]
    val result = when (operator) {
        '+' -> firstNum + secondNum
        '-' -> firstNum - secondNum
        '*' -> firstNum * secondNum
        else -> "Invalid Operator"
    }

    println("$firstNum $operator $secondNum = $result")
}
