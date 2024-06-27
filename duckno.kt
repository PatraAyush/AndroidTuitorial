fun main() {
    var number = 1204

    if (isDuckNumber(number)) {
        println(" a duck number.")
    } else {
        println("not a duck number.")
    }
}

fun isDuckNumber(num: Int): Boolean {
    var n = num
    while (n != 0) {
        val digit = n % 10
        if (digit == 0) {
            return true
        }
        n /= 10
    }
    return false
}
