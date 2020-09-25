import java.util.*

class Person (val name: String) {
    override fun toString() : String = name
}

fun main(){
    val hans = Person("Hans")
    val peter = Person("Peter")
    val maria = Person("Maria")
    val gunter = Person("Gunter")
    val donald = Person("Donald")
    val petra = Person("Petra")

    val schlange : Queue<Person> = ArraySchlange()
}

class ArraySchlange(size : Int = 1) : Queue<Person>{

    var schlange = Array<Person>(size){Person("DUMMY")}

    override fun add(element: Person?): Boolean {
        TODO("Not yet implemented")
    }

    override fun remove(): Person {
        TODO("Not yet implemented")
    }

    override val size: Int
        get() = TODO("Not yet implemented")

    override fun addAll(elements: Collection<Person>): Boolean {
       return true
    }

    override fun clear() {

    }

    override fun iterator(): MutableIterator<Person> {
        return schlange.toMutableList().iterator()
   }

    override fun contains(element: Person?): Boolean {
        return true
    }

    override fun containsAll(elements: Collection<Person>): Boolean {
        return true
    }

    override fun isEmpty(): Boolean {
        return true
    }

    override fun remove(element: Person?): Boolean {
        return true
    }

    override fun removeAll(elements: Collection<Person>): Boolean {
        return true
    }

    override fun retainAll(elements: Collection<Person>): Boolean {
        return true
    }

    override fun offer(e: Person?): Boolean {
        return true
    }

    override fun poll(): Person {
        return Person("Dummy")
    }

    override fun element(): Person {
        return Person("Dummy")
    }

    override fun peek(): Person {
        return Person("Dummy")
    }

}