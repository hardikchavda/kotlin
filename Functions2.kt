import java.util.Scanner

/**
 * @author Er. Hardik Chavda
 * https://t.me/hardikchavda
 *
 */
//Default Arguments
fun draw(name: String? = null, age: Int? = null, address: String? = null) {

    // String Template Example
    println("${name?.uppercase()} lives in ${address?.uppercase()} and age is $age")
}

fun main() {
    val readData = Scanner(System.`in`)

    //Takes data from User
    println("Give your name")
    val name = readData.nextLine()
    println("Give your country name")
    val address = readData.nextLine()
    println("Give your age")
    val age = readData.nextInt()

    //Named Arguments
    draw(name = name, address = address, age = age)

}