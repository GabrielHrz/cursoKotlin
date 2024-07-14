package POO

class Usuario2 constructor(nombre: String, apellido: String) {
    var nombre : String = ""
    var apellido : String = ""

    init { //inicializar

        this.nombre = nombre
        this.apellido = apellido
        println("Objeto inicializado ")
        println("nombre : $nombre y apellido : $apellido")
    }
    constructor(nombre : String) : this(nombre, ""){ //Constructor secundario
        println("Constructor secundario")



    }

}

fun main(){

    val usuario = Usuario2("Jose")


}