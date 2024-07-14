package POO
//public -> Visible en todo lugar
//private -> visible apenas dentro de la clase
//protected -> visible apenas dentro de la clase o de subclases(clases hijas)
//internal -> Visible en todo lugar dentro de un modulo
//Si no defini un modificador de acceso el sera public por default
 abstract class Carro{
     protected open fun inyectarGasolina(){
         println("Inyectando Gasolina")
     }

      fun acelerar(){
        inyectarGasolina()
        println("Acelerar el carro")
    }

}

class Ferrari : Carro(){
    override fun inyectarGasolina() {
        println("Inyectando Gasolina premium")
    }

}
class Optra : Carro(){
    override fun inyectarGasolina() {
        println("Inyectando gasolina 85")
    }
}

fun main(){

    val carro = Optra()
    carro.acelerar()


}