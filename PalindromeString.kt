
fun main() {
    val result = isPalindrome("noon")
    if (result) {
        println("The given string is a palindrome string")
    } else {
        println("The given string is not a palindrome string")
    }
}

fun isPalindrome(str: String): Boolean {
    var start = 0
    var end = str.length - 1

    while (start < end) {
        if (str[start]!= str[end]) {
            return false
        }
        start++
        end--
    }
    return true
}
