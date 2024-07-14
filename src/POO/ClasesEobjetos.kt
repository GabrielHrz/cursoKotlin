package POO


class Jugador{
    //Propiedades
    var kart = ""
    var rueda = ""
    var planador = ""

    //Metodos
    fun acelerar(acelerar : Int = 0){
        println("Acelerar a la velocidad $acelerar")
    }
    fun retornarPoder(): String{

        return "Casco Rojo"

    }



}

fun main(args: Array<String>) {
    var jugador = Jugador()
    jugador.acelerar(10)
    val poder = jugador.retornarPoder()
    println(poder)

}