package POO

abstract class Animal2{


    var color = ""
    var tamano = ""
    var peso = 0.0

    open fun correr(){
        println("Corriendo como un ")
    }
    abstract fun dormir()
}

class Perro2 : Animal2(){

    override fun correr(){
        super.correr()
        println("perro en 4 patas")
    }

    fun ladrar(){
        println("El perro esta Ladrando")
    }
    override fun dormir(){
        println("El perro esta Dormir")
    }


}
class Pajaro2 : Animal2(){

    override fun correr(){
        println("Corre en 2 patas")
    }

    fun volar(){
        println("El pajaro esta Volando")
    }
    override fun dormir(){
        println("El pajaro esta Dormir")
    }

}

fun main(){

    val black = Perro2();
    black.correr()
    black.ladrar()

    val white = Pajaro2()
    white.correr()
    white.volar()
}