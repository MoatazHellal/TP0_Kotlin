class Rectangle(var p:Point = Point(0,0) , var q:Point=Point(1,1)) {
    override fun toString(): String{
        return ("p= $p q=$q")
    }
    fun surface():Int{
        return (p.x-q.x)*(p.y-q.y)
    }
}