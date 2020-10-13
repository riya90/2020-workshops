import java.io.File
//change println(e) to println("$e") to see errors

fun main() {
    try {
        println("[*] Welcome!")
        print("[*] (+, -, *, /, **2) or Notes: ")
        val opChoice = readLine()

        when (opChoice) {
            "+" -> add()
        }
        when (opChoice) {
            "-" -> sub()
        }
        when (opChoice) {
            "*" -> mult()
        }
        when (opChoice) {
            "/" -> divide()
        }
        when (opChoice) {
            "**2" -> square()
        }
        when (opChoice) {
            "Notes" -> notes()
        }
    }
    catch(e: Exception) {
        println(e)
        println("[*]Please enter a valid response!")
    }

}

fun add() {
    try {
        print("[*]First number: ")
        val addDigit = Integer.valueOf(readLine())
        print("[*]Second Number: ")

        val sAddDigit = Integer.valueOf(readLine())
        println(addDigit + sAddDigit)
    }
    catch (e: Exception) {
        println(e)
        print("[*]Please enter a valid response!")
    }
}
fun sub() {
    try {
        print("[*]First number: ")
        val addDigit = Integer.valueOf(readLine())
        print("[*]Second Number: ")

        val sAddDigit = Integer.valueOf(readLine())
        println(addDigit - sAddDigit)
    }
    catch (e: Exception) {
        println(e)
        print("[*]Please enter a valid response!")
    }
}
fun mult() {
    try {
        print("[*]First number: ")
        val addDigit = Integer.valueOf(readLine())
        print("[*]Second Number: ")

        val sAddDigit = Integer.valueOf(readLine())
        println(addDigit * sAddDigit)
    }
    catch(e: Exception) {
        print(e)
        print("[*]Please enter a valid response!")
    }
}
fun divide() {
    try {
        print("[*]First number: ")
        val addDigit = Integer.valueOf(readLine())
        print("[*]Second Number: ")

        val sAddDigit = Integer.valueOf(readLine())
        println(addDigit / sAddDigit)
    }
    catch(e: Exception) {
        print(e)
        print("[*]Please enter a valid response!")
    }
}
fun square() {
    try {
        print("[*]Number: ")
        val addDigit = Integer.valueOf(readLine())

        println(addDigit * addDigit)
    }
    catch(e: Exception) {
        println(e)
        print("[*]Please enter a valid response!")
    }
}
fun notes() {
    try {
        println("[*]Start of Notes~")
        val noteTake = readLine()
        File("data.txt").writeText("$noteTake")
    }
    catch(e: Exception) {
        println(e)
        print("[*]Please enter a valid response!")
    }
}