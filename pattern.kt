fun main() {
    var i=0
    var j=0
    for(i in 0 until 5){
        for(j in 0 until (5-i-1)){
            print(" ")
        }
        for(j in 0 until (2*i+1)){
            print("*")
        }
        println()
    }
    for(i in 5 downTo 0){
        for(j in 0 until (5-i)){
            print(" ")
        }
        for(j in 0 until (2*i-1)){
            print("*")
        }
        println()
    }
}
