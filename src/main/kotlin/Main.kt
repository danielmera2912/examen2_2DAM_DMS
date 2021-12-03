import java.lang.Math.sqrt
class Punto(id: String){
    val id: String = id
    var cordX: Int?= null
    var cordY: Int?= null
    constructor(id: String, cordX: Int, cordY: Int) : this(id) {
        this.cordX=cordX
        this.cordY=cordY
    }
    companion object{
        fun componenteDeVector (p1: Punto, p2: Punto): Punto{
            // guardamos el nombre que tendrá el nuevo punto
            var nId = p1.id+""+p2.id
            // guardamos la coordenada X e Y del nuevo vector
            var nX= p2.cordX!! - p1.cordX!!
            var nY = p2.cordY!! - p1.cordY!!
            return Punto(nId, nX, nY)
        }
        fun localizacionGeograficaNS (puntos: Array<Punto>): Map<String, List<Punto>>{
            // filtramos todos los puntos del array filtrado según si la coordenada Y es mayor o menor a 0 para quedarnos solo con la lista del norte
            var norte= puntos.filter { it.cordY!! >=0 }
            // filtramos todos los puntos del array filtrado según si la coordenada Y es mayor o menor a 0 para quedarnos solo con la lista del sur
            var sur= puntos.filter { it.cordY!! <0 }
            // retornamos el mapa guardando la lista norte en la posición del mapa llamado Norte, e igual con el Sur
            return  mapOf("Norte" to norte, "Sur " to sur)
        }

        fun distancia(p1: Punto, p2: Punto): Double{
            // guardamos la coordenada X e Y del nuevo vector
            var nX= p2.cordX!!-p1.cordX!!.toDouble()
            var nY= p2.cordY!!-p1.cordY!!.toDouble()
            // realiza la raiz y las potencias con las coordenadas correctas
            return sqrt(Math.pow(nX, 2.0) + Math.pow(nY, 2.0))
        }

    }
    fun obtenerCoordenadas()= Pair(this.cordX, this.cordY)
    override fun toString() = "punto <$id> -> [<$cordX>,<$cordY>]"

}
