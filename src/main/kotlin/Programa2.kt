fun main(){
    println("Programa 2:")
    var p1 =Punto("p1",-1, 0)
    var p2 =Punto("p2",3, -1)
    var p3 =Punto("p3",-4, 4)
    var p4 =Punto("p4",-3, 2)
    var p5 =Punto("p5",6, -4)
    var p6 =Punto("p6",-5, 6)
    var p7 =Punto("p7",10, -8)
    var p8 =Punto("p8",1, 5)
    var p9 =Punto("p9",6, -7)
    val puntos = arrayOf(p1,p2,p3,p4,p5,p6,p7,p8,p9)
    println(Punto.localizacionGeograficaNS(puntos))
}
