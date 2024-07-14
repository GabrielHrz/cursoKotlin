package kotlinBasico

fun saludoConRetorno(nombre : String) : String {
    println("Hola $nombre");
    return nombre;
}

fun main(){

    var nombre : String = saludoConRetorno("gabriel")

}