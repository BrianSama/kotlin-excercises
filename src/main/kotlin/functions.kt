fun main(){
    println("Enter the first Number")
    val firstNumber = readln().toFloat()
    println("Enter the second Number")
    val secondNumber = readln().toFloat()
    println("Enter the third Number")
    val thirdNumber = readln().toFloat()
    multiplyThreeNumbers(firstNumber,secondNumber,thirdNumber)
}

fun multiplyThreeNumbers(a:Float, b:Float, c:Float){
    val x = a*b*c
    print("The Multiple of $a, $b and $c is $x")

}