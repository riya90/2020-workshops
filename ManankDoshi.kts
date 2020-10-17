/*
Print out your name onto the console.

e.g. your program should print "Andy Min".
 */
fun level1() {
    println("Manank Doshi")
}

/*
Print out how many letters your name has.

DON'T hardcode a number and just print "8" for example.
You should set your name as a variable, and then print out how many letters
that variable has.
 */
fun level2() {
    val name = "Manank Doshi"
    println(name.length)
}

/*
Prompt the user to enter their some text, and then print out only the UPPERCASE
letters.

e.g. Entering "tHis iS a rANdoM meSSagE" should print out "HSANMSSE"
 */
fun level3() {
    println("Enter some text using lower and upper case letters: ");
    val text = readLine()!!
    for(character in text){
        if(character.isUpperCase()){
            print(character)
        }
    }

}



level1()
level2()
level3()