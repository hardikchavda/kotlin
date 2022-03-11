/**
 * @author Er. Hardik Chavda
 * https://t.me/hardikchavda
 *
 */

open class Animal {
    open var color = ""
    open var language = ""
    open fun display() {
        println("There are so many animals lives here in woods.")
    }
}

class Dog : Animal() {
    override var color = "Black"       //Overrides Property
    override var language = "Barks"    //Overrides Property
    override fun display() {           //Overrides Animal display method
        println("${javaClass.simpleName} has $color color and it $language")
    }
}

class Cat : Animal() {
    override var color = "Brown"        //Overrides Property
    override var language = "Meows"      //Overrides Property
    override fun display() {            //Overrides Animal display method
        super<Animal>.display()         //Will call Animal display method first.
        println("${javaClass.simpleName} has $color color and it $language")
    }
}

fun main() {
    val pet1 = Cat()
    pet1.display()

    val pet2 = Dog()
    pet2.display()
}