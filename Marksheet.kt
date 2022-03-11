import java.util.Scanner

class Marksheet(a_s1: Int, a_s2: Int, a_s3: Int) {
    val s1 = a_s1
    val s2 = a_s2
    val s3 = a_s3

    fun result() {
        var result: String = ""
        if (s1 < 28 || s2 < 28 || s3 < 28) {
            println("Fail")
        } else {
            var total = s1 + s2 + s3
            var per = (total.toDouble() / 300) * 100
            if (per >= 70) {
                result = "Passed with Distinction"
            } else if (per >= 60) {
                result = "Passed with First Class"
            } else if (per >= 50) {
                result = "Passed with Second Class"
            } else if (per >= 40) {
                result = "Passed with Third Class"
            }
            println(total)
            println(String.format("%.2f", per).toDouble())
            println(result)
        }
    }
}

fun main() {

    val readdata = Scanner(System.`in`)

    try {
        println("Enter Marks 1")
        val s1 = readdata.nextInt()
        println("Enter Marks 2")
        val s2 = readdata.nextInt()
        println("Enter Marks 3")
        val s3 = readdata.nextInt()

        val stud1 = Marksheet(s1, s2, s3)
        println(stud1.result())

    } catch (e: Exception) {
        println(e.message + " Please Enter Numeric Value Only")
    }


}
