fun main(){
    var v1 = My3DVector(1,2,3)
    var v2 = My3DVector(2,5,7)
    println(v1)
    println(v2)
    println("სკალარული ნამრავლია:"+v1.scal(v2))
    println("ვექტორული ნამრავლია:"+v1.veqt(v2))


}

class My3DVector(var x: Int,var y: Int, var z:Int) {
    fun scal(obieqti: My3DVector): Int {
        return x * obieqti.x + y * obieqti.y + z * obieqti.z
    }

    fun veqt(classObject: My3DVector) : String {

        return "(${y * classObject.z - z * classObject.y}; ${z * classObject.x - x * classObject.z};" +
                " ${x * classObject.y - y * classObject.x})"

    }

    override fun toString(): String {
        return "($x,$y,$z)"
    }
}

//fasgag

