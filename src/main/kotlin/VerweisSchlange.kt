import java.util.Queue

class VerweisSchlange<T> : Queue<T> {

    class VerweisSchlangeWrapper<T>(val data: T) {
        var nachfolger: VerweisSchlangeWrapper<T>? = null
    }

    val firstElement: T? get() = first?.data
    val lastElement: T? get() = last?.data

    private var first: VerweisSchlangeWrapper<T>? = null
    private val last: VerweisSchlangeWrapper<T>? get() {
        return if(first != null) {
            var i = first!!
            while(i.nachfolger != null) {
                i = i.nachfolger!!
            }
            i
        } else null
    }

    override fun add(element: T): Boolean {
        val newWrapper = VerweisSchlangeWrapper(element)
        if (first == null) {
            first = newWrapper
            return true
        } else {
            var i = first!!.nachfolger
            while (i != null) {
                if (i.nachfolger == null) {
                    i.nachfolger = newWrapper
                    return true
                }
                i = i.nachfolger
            }

            first!!.nachfolger = newWrapper
            return true
        }
    }

    override fun remove(): T {
        if (first != null) {
            val tmp = first!!.data
            first = first!!.nachfolger
            return tmp
        }
        error("The Queue is empty, cannot remove anything! ")
    }

    override val size: Int
        get() {
            var count = 0
            if (first != null) {
                count += 1
                var i = first!!.nachfolger
                while (i != null) {
                    count += 1
                    i = i.nachfolger
                }
            }
            return count
        }

    override fun addAll(elements: Collection<T>): Boolean {
        elements.forEach {
            this.add(it)
        }
        return true
    }

    override fun clear() {
        first = null
    }

    override fun iterator(): MutableIterator<T> {
        TODO()
    }

    override fun contains(element: T?): Boolean {
        return true
    }

    override fun containsAll(elements: Collection<T>): Boolean {
        return true
    }

    override fun isEmpty(): Boolean {
        return true
    }

    override fun remove(element: T?): Boolean {
        return true
    }

    override fun removeAll(elements: Collection<T>): Boolean {
        return true
    }

    override fun retainAll(elements: Collection<T>): Boolean {
        return true
    }

    override fun offer(e: T?): Boolean {
        return true
    }

    override fun poll(): T {
        TODO()
    }

    override fun element(): T {
        TODO()
    }

    override fun peek(): T {
        TODO()
    }

    override fun toString(): String {
        var str = "["
        var i = first
        while (i != null) {
            str += i.data.toString()
            if (i.nachfolger != null) str += ", "
            i = i.nachfolger
        }
        str += "]"
        return str
    }


}