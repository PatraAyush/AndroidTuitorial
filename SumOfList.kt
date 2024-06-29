
fun main() {
    val s= sumOfList(1,2,3,4,5,6,7,8,9)
    println("The sum of the list is $s")
}
fun sumOfList(vararg numbers: Int):Int{
    var r=0
    for (num in numbers){
        r=r+num
    }
    return r
}
