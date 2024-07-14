package POO

interface Programador{

    val lenguage: String
    val area : String

    fun cargo();
}

abstract class Persona constructor(nombrep : String, apellidoP : String, edadP : Int){

    private var nombre : String = ""
    private var apellido : String = ""
    private var edad : Int = 0

    init {
        this.nombre = nombrep
        this.apellido = apellidoP
        this.edad = edadP
    }

    fun nombreCompleto(){
        println("Tu nombre completo es $nombre $apellido y tienes $edad")
    }

}

class AndroidDeveloper constructor(nombrep : String, apellidoP : String, edadP : Int, lenguageP : String, area : String) : Persona(nombrep, apellidoP, edadP), Programador{

    override var lenguage: String
    override var area : String

    init {
        this.lenguage = lenguageP
        this.area = area
    }

    override fun cargo(){
        println("eres un desarrollador $area y tu lenguage de programacion es $lenguage")

    }


}
fun main() {

    val desarrolladorKotlin = AndroidDeveloper("Gabriel","Romero",22,"kotlin","movil")
    desarrolladorKotlin.nombreCompleto()
    desarrolladorKotlin.cargo()

}