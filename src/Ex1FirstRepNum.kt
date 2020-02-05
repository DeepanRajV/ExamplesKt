import kotlin.math.abs
import kotlin.random.Random

fun main() {
    val n = 10
    val a = Array(n) { Random.nextInt(n) + 1 }

    println(a.asList())

    for (i in a) {
        val index = abs(i) - 1
        if (a[index] < 0) {
            println("First repeated number : " + abs(i))
            return
        } else {
            a[index] = -a[index]
        }
    }
    println("No repeated numbers")
}
