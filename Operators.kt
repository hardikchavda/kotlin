/**
 * @author Er. Hardik Chavda
 * https://t.me/hardikchavda
 *
 */
import java.util.Scanner

fun calc(val1: Int, val2: Int, symbol: Char): Double {
    var calc = 0.0
    println(symbol)
    when (symbol) {
        '+' -> calc = (val1 + val2).toDouble()
        '-' -> calc = (val1 - val2).toDouble()
        '*' -> calc = (val1 * val2).toDouble()
        '/' -> calc = (val1 / val2).toDouble()
    }
    return calc
}

fun main() {
    //Scanner Class
    var reader = Scanner(System.`in`)

    //Getting Input from User
    var val1 = reader.nextInt()
    var val2 = reader.nextInt()
    var symbol = reader.next()

    //Showing Results
    val data = calc(val1, val2, symbol.first())
    println(data)
}