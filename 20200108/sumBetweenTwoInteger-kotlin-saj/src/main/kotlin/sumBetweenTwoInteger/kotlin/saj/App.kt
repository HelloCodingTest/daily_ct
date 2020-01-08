package sumBetweenTwoInteger.kotlin.saj

fun sumBetweenTwoInteger(a: Int, b: Int): Long {
    val min = Integer.min(a, b)
    val max = Integer.max(a, b)

    return (min.toLong()..max.toLong()).fold(0L) { total, value -> total + value }
}