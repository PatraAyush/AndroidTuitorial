
fun main() {
    val fact=factorial(4)
    println("Factorial:$fact")
}
fun factorial(n :Int):Int
{
    if(n<=1)
    {
        return 1 
    }
    else{
        return n*factorial(n-1)
    }
}