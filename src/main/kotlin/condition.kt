fun main() {
    println("Enter Your Year of Birth")
    val year = readln().toInt()

   when(year){
       in 0..1959 -> println("You are a Boomer")
       in 1960 .. 1973 -> println("You are a Gen X")
       in 1974..1995 -> println("You are a Millennial ")
       in 1996..2015 -> println("You are a Gen Z")
       else ->
       {
           println("You are in the future")
       }

   }

//    if (year<= 1959){
//        print("You are a Baby Boomer")
//    }
//    else if (year<=1990){
//        print("you are a Gen X")
//    }
//    else if (year<=2015){
//        print("You are ")
//    }
//    else {
//        println(" You are a Baby")
//    }

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.

}