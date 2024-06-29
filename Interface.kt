
fun main() {
    val tri =triangle(4.0,5.0,6.0,9.0,8.0)
    val sq =square(5.0)
    val draw : List<drawable> = listOf(tri ,sq)
    for (i in draw) 
    {
        i.drawInfo() 
    }
}
interface drawable
{
    fun drawInfo() 
}
class triangle (var base :Double ,var height :Double , var s1:Double , var s2:Double ,var s3 :Double) :drawable{
    fun area() :Double =0.5*base*height
    fun perimeter():Double =s1+s2+s3
    override fun drawInfo()
    {
        println("Triangle:")
        println("Base:$base")
        println("Height:$height")
        println("Sides:$s1 ,$s2 ,$s3")
        println("Area:${area()}")
        println("Perimeter:${perimeter()}")
    }
}
class square(var s:Double):drawable{
    fun area() :Double =s*s
    fun perimeter():Double =4*s
    override fun drawInfo()
    {
        println("Square")
        println("Side:$side")
        println("Area:${area()}")
        println("Perimeter:${perimeter()}")
    }
}