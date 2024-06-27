fun main() {
    var i=153
    var n=i
    var s=0
    while(i>0){
        var d=i%10
        s=s+(d*d*d)
        i=i/10
    }
    if(n==s){
        println("armstrong no")
    }else{
        println("not an armstrong no")
    }
}
