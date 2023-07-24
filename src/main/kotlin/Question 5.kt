//A person is moving to his village with a car moving at 20km/h and He has many
//alternative routes.
//If he uses route1, he'll move a distance of 5000km
//If he uses route2, he'll move a distance of 25000km
//If he uses route3, he'll move a distance of 50000km
//If he uses another, he'll move a distance of 10000km
//
//Find the time it will take him to reach the village using the separate routes
//-using an if statement
//-using a when statement

fun main(){
    val speed = 20 //in km/h
    val distance1 = 5000
    val distance2 = 25000
    val distance3 = 50000
    val distance = 10000
    var time = 0
    print("""Which route will the Person Take?
 Choose by entering any of these options
 route1
 route2
 route3
Enter your route: """)
    val route = readln()

//-using an if statement
    if (route == "route1"){
        time = distance1/speed
        println("the time it will take him to reach the village is $time hours")
    }
    else if (route == "route2"){
        time = distance2/speed
        println("the time it will take him to reach the village is $time hours")
    }
    else if (route == "route3"){
        time = distance3/speed
        println("the time it will take him to reach the village is $time hours")
    }
    else {
        time = distance/speed
        println("the time it will take him to reach the village is $time hours")
    }

//-using a when statement Uncomment to test code
//    when(route){
//        "route1" -> {
//                    time = distance1/speed
//                    println("the time it will take him to reach the village is $time hours")}
//        "route2" -> {
//                    time = distance2/speed
//                    println("the time it will take him to reach the village is $time hours")}
//        "route3" -> {
//                    time = distance3/speed
//                    println("the time it will take him to reach the village is $time hours")}
//        else -> {
//                    time = distance/speed
//                println("the time it will take him to reach the village is $time hours")}
//    }
//

}