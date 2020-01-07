fun sumBetweenTwoInteger(a: Int, b: Int): Long {
    return when {
        a < b -> (a..b).sum().toLong()
        a > b -> (b..a).sum().toLong()
        else -> a.toLong()
    }
}