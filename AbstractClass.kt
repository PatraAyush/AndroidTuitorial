abstract class shapes
{
    abstract fun area():Double
}
class rectangle(var width :Double ,var height :Double):shapes()
{
    override fun area() : Double =width*height 
    fun perimeter() :Double =2*(width+height) 
}
class circle(var radius :Double):shapes()
{
    override fun area() :Double=3.14*radius*radius
    fun perimeter() :Double=2*3.14*radius
}
fun main(){
    val shape: List<shapes> = listOf(rectangle(6.0, 17.0) , circle(4.0))
    for (i in shape)
    {
       println("Area is ${i.area()}")
       if (i is rectangle){
          println("Perimeter is ${i.perimeter()}")
       }
        else if (i is circle){
            println("Perimeter is ${i.perimeter()}") 
           }
    }
}
