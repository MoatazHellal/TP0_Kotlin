fun main(argv : Array<String>){
    fun distance(p: Point , q:Point): Int{
       return p.x - q.x + p.y - q.y
    }
    val rectangles = arrayOf(Rectangle(),Rectangle(Point(0,1),Point(2,2)),Rectangle(Point(3,3),Point(1,1)))
    var surface:Int
    for(i in 0..rectangles.size-1){
        surface=rectangles[i].surface()
        println ("la surface du rectangle $i est : $surface" )
    }

}