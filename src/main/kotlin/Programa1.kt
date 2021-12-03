fun main(){
    println("Programa 1:")
    var p1= Punto("pA",3,2)
    var p2= Punto("pB",1,3)
    println(p1.toString())
    println(p2.toString())
    println(Punto.componenteDeVector(p1,p2).toString())
}