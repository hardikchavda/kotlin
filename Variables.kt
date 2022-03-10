/**
 * @author Er. Hardik Chavda
 * https://t.me/hardikchavda
 *
 */

// Auto Type Init Support
var str = "Text"    //String
var num = 10        //Integer
var real = 1.5      //Double
var real2 = 1.5F    //Float
var yes_no = true    //Boolean\

// Default Type Init Support
var str2: String = "Text"       //String
var num2: Int = 10              //Integer
var real22: Double = 1.5        //Double
var real222: Float = 1.5F       //Float
var yes_no2: Boolean = false    //Boolean

fun main() {
    println("--------------")
    println("$str : $str2")    //String Template
    println((num + num2).toString() + "Concatenation")
    println(real + real22)
    println(real2 + real222)
    println(yes_no)
    println(yes_no2)
    println("--------------")
}