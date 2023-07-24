//A person has four option of choosing between;
//pizza, chicken, pancakes or cake. If they choose pizza, they'll go to pizza hut,
//if chicken, they'll go to kfc, if pancakes, they'll go to foodhub,
//if cake, they'll go to cakely. Write
//-a program using an if statement that captures the persons choice and prints the
//selected restaurant
//-same program using a when statement

fun main() {
    print("""What do you want to eat?
 Choose by selecting the number
 1. Pizza
 2. Chicken
 3. Pancakes
 4. Cake
Enter your choice: """)
    val food = readln().toInt()

//    IF ElSE IMPLEMENTATION
    if (food == 1){
        println("You'll go to Pizza Hut")
    }
    else if (food == 2){
    println("You'll go to KFC")
    }
    else if (food == 3){
        println("You'll go to FoodHub")
    }
    else if (food == 4){
        println("You'll go to Cakely")
    }
    else {
        println("That's an invalid input")
    }

//    WHEN IMPLEMENTATION Uncomment to test code
//    when(food){
//        1 -> println("You'll go to Pizza Hut")
//        2 -> println("You'll go to KFC")
//        3 -> println("You'll go to FoodHub")
//        4 -> println("You'll go to Cakely")
//        else -> println("That's an invalid input")
//    }
}