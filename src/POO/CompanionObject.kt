package POO

//es utilizado para definir atributos o metodos asociados a clases e no a los objetos
class Carro2( var modelo : String = "",var velocidad : Int = 0){
    companion object {
        const val VELOCIDAD_MAXIMA_PERMITIDA : Int = 120
        fun exhibirVelocidadMaxima(){
            println("La velocidad maxima es $VELOCIDAD_MAXIMA_PERMITIDA")
        }
    }
    fun exhibirInformacion(){
        println("Informacion : $modelo y $velocidad")
    }


}

fun main(args: Array<String>) {
    println("Velocidad maxima permitida ${Carro2.VELOCIDAD_MAXIMA_PERMITIDA}")
    Carro2.exhibirVelocidadMaxima()
}