import kotlin.system.exitProcess

//calculator program remade hehe

fun main() {
    print("Choose an operator: +, -, /, *, **, sqrt, notes: ")
    val x = readLine()
    when(x) {
        "+" -> add()
        "-" -> sub()
        "/" -> divide()
        "*" -> multiply()
        "**" -> square()
        "sqrt" -> sqrt()
//        "notes" -> notes()
        else -> {
            print("Invalid Input!")
        }
    }
}
fun add() {
    print("How many numbers would you like to add? ")
    val amount = readLine()!!
    val enteredAmount = amount.toInt()
    var mutableList = mutableListOf<Int>()
    for (i in 0 until enteredAmount) {
        print("Enter a number: ")
        val enteredNumber = readLine()!!
        val Number = enteredNumber.toInt()
        mutableList.add(Number)
    }
    print(mutableList.sum())
    print("\n")
    print("Would you like to exit? Yes or No: ")
    val cont = readLine()!!
    if (cont == "No") {
        main()
    }
    if (cont == "Yes") {
        exitProcess(1)
    }
}
fun sub() {
    print("How many numbers would you like to subtract? ")
    val amount = readLine()!!
    val enteredAmount = amount.toInt()
    var mutableList = mutableListOf<Int>()
    for (i in 0 until enteredAmount) {
        print("Enter a number: ")
        val enteredNumber = readLine()!!
        val Number = enteredNumber.toInt()
        mutableList.add(Number)
    }
    var saveNum = mutableList[0]
    mutableList.removeAt(0)
    for (n in mutableList) {
        saveNum -= n
    }
    print(saveNum)
    print("\n")
    print("Would you like to exit? Yes or No: ")
    val cont = readLine()!!
    if (cont == "No") {
        main()
    }
    if (cont == "Yes") {
        exitProcess(1)
    }
}

fun divide() {
    print("How many numbers would you like to divide? ")
    val x = readLine()!!
    val xInt = x.toInt()
    var mutableList = mutableListOf<Int>()
    for (i in 0 until xInt) {
        print("Enter a number: ")
        val input = readLine()!!
        val inputInt = input.toInt()
        mutableList.add(inputInt)
    }
    var saveNum = mutableList[0]
    mutableList.removeAt(0)
    for (n in mutableList) {
        saveNum /= n
    }
    print(saveNum)
    print("\n")
    print("Would you like to exit? Yes or No: ")
    val cont = readLine()!!
    if (cont == "No") {
        main()
    }
    if (cont == "Yes") {
        exitProcess(1)
    }
}

fun multiply() {
    print("How many numbers would you like to multiply? ")
    val x = readLine()!!
    val xInt = x.toInt()
    var mutableList = mutableListOf<Int>()
    for (i in 0 until xInt) {
        print("Enter a number: ")
        val input = readLine()!!
        val inputInt = input.toInt()
        mutableList.add(inputInt)
    }
    var saveNum = mutableList[0]
    mutableList.removeAt(0)
    for (n in mutableList) {
        saveNum *= n
    }
    print(saveNum)
    print("\n")
    print("Would you like to exit? Yes or No: ")
    val cont = readLine()!!
    if (cont == "No") {
        main()
    }
    if (cont == "Yes") {
        exitProcess(1)
    }
}

fun square() {
    print("What number would you like to square? ")
    val x = readLine()!!
    val xInt = x.toInt()
    val xSquared = xInt * xInt
    print("$xSquared")
    print("\n")
    print("Would you like to exit? Yes or No: ")
    val cont = readLine()!!
    if (cont == "No") {
        main()
    }
    if (cont == "Yes") {
        exitProcess(1)
    }
}

fun sqrt() {
    print("What number would you like to square root? ")
    val x = readLine()!!
    val xInt = x.toDouble()
    val xSqrRoot = Math.sqrt(xInt)
    print("$xSqrRoot")
    print("\n")
    print("Would you like to exit? Yes or No: ")
    val cont = readLine()!!
    if (cont == "No") {
        main()
    }
    if (cont == "Yes") {
        exitProcess(1)
    }
}