fun main() {
    oddNumbers()

    var x= arrayNames(arrayOf("Dan","June","Glenn","Francis","Duke"))
    println(x)
    serveDrinks(4)
    serveDrinks(9)
    serveDrinks(19)
    serveDrinks(6)
    numbersMultiple()



}
//Create a function that prints out all the odd numbers between 1 and 100 (2pts)
fun oddNumbers() {
    for ( nums in 1..100)
        if(nums % 2 != 0){
            println(nums)
        }}
//Create a function that takes in an array of names and returns the number of
//names longer than 5 characters
fun arrayNames(names:Array<String>):Int {
    var sum =0
    for (name in names) {
        if (name.length > 5) {
            sum++
        }
    }
    return sum
}

//You are creating a robot to serve drinks at a party. The robot is required to
//serve a glass of milk for guests under the age of 6. For guests under the age of
//15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
//else gets a bottle of coca cola. Create a function that will make these
//decisions, printing out the name of the drink each person gets according to
//their age.
fun serveDrinks(ages:Int){
    if(ages < 6) {
        println("Serve milk")
    }
    else if( ages in 6..14){
        println("serves a bottle of fanta orange ")}
    else {
        println(" serves a bottle cocacola")
    }
}
//4. Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number.

fun numbersMultiple() {
    for (numbers in 1..100) {
        when {
            numbers % 3 == 0 && 5 == 0 -> println("FuzzBuzz")
            numbers % 3 == 0 -> println("Fuzz")
            numbers % 5 == 0 -> println("Buzz")
        }

    }

}