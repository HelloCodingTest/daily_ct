fun watermelon(n: Int): String {
    var string = ""
    (1..n).forEach {
        if (it % 2 == 0) string += "박"
        if (it % 2 == 1) string += "수"
    }
    return string
}