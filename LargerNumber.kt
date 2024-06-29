
fun main() {
    val larger=largerOf(9,5)
    println("The larger of the two number is $larger")
}
fun largerOf(a:Int ,b:Int):Int{
    if(a>b){
        return a
    }
    else{
        return b
    }
}