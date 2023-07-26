//write a function that has three parameters; two doubles and one character
//(*, +, -, /) and checks if third parameter
// == *, it will multiply the two doubles
// == +, it will add the two numbers
// == -, it will subtract the two numbers
// == /, it will divide the two numbers

fun calculate(a:Double,b:Double,c:Char){

    if(c == '*'){
        val answer = a*b
        println("The result of $a $c $b is $answer")
    }
    else if(c == '+'){
        val answer = a+b
        println("The result of $a $c $b is $answer")
    }
    else if(c == '-'){
        val answer = a-b
        println("The result of $a $c $b is $answer")
    }
    else if(c == '/'){
        val answer = a/b
        println("The result of $a $c $b is $answer")
    }
    else
        println("You entered an invalid operator")

}

//Main Function and testing
fun main(){
    //Testing Function
    println("This Application will help you calculate the result of two numbers")
    println("Please enter the first number")
    val firstNumber = readln().toDouble()
    println("Please enter the second number")
    val secondNumber = readln().toDouble()
    println("Please enter the operator *, +, - or /")
    val operator = readln()[0]
    calculate(firstNumber,secondNumber,operator)
}
