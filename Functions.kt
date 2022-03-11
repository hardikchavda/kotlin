/**
 * @author Er. Hardik Chavda
 * https://t.me/hardikchavda
 *
 */

class Student {
    var skills: String? = null      // null assignment
    fun display() {
        println(skills)
    }
}

fun main() {
    val stud1 = Student()
    stud1.skills = "Singing"
    stud1.display()

    val stud2 = Student()
    stud2.skills = "Karate"
    stud2.display()

    // var stud3 = stud1.plus(stud2)// Extension  Function
    // var stud3 = stud1 plus stud2 // Infix Function
    val stud3 = stud1 + stud2       // Operator Overload with Infix Function
    stud3.display()
}

infix operator fun Student.plus(s1: Student): Student {
    val newStud = Student()
    newStud.skills = this.skills + " & " + s1.skills
    return newStud
}