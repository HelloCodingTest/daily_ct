fun sumBetweenTwoInteger(a: Int, b: Int): Long {
    return when {
        a < b -> (a.toLong()..b.toLong()).sum().toLong()
        a > b -> (b.toLong()..a.toLong()).sum().toLong()
        else -> a.toLong()
    }
}