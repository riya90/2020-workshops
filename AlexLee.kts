import java.util.*

/*
Print out your name onto the console.

e.g. your program should print "Andy Min".
 */
fun level1() {
    // Your code here
    println("Alex Lee")
}

/*
Print out how many letters your name has.

DON'T hardcode a number and just print "8" for example.
You should set your name as a variable, and then print out how many letters
that variable has.
 */
fun level2() {
    // Your code here
    val name = "Alex Lee"
    println(name.length)
}

/*
Prompt the user to enter their some text, and then print out only the UPPERCASE
letters.

e.g. Entering "tHis iS a rANdoM meSSagE" should print out "HSANMSSE"
 */
fun level3() {
    val sc = Scanner(System.`in`)
    println("Input some text")
    val input = sc.nextLine()
    for(x in 0..input.length - 1) {
        if(input.get(x) == input.get(x).toUpperCase() && input.get(x) != ' ') {
            print(input.get(x))
        }
    }
    // Your code here
}



level1()
level2()
level3()