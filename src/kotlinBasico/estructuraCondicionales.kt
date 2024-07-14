package kotlinBasico

fun main(args: Array<String>) {
    var nombre: String? = null
    var apellido: String? = null
    var edad: Int? = null

    print("Escoge una opción 1-Nombre, 2-Apellido, 3-Edad: ")
    val opcion = readLine()?.toIntOrNull() ?: 0 // Convierte la entrada a Int, si falla asigna 0

    when (opcion) {
        1 -> {
            println("La opción 1 fue escogida")
            print("Digita tu nombre: ")
            nombre = readLine()
        }
        2 -> {
            println("La opción 2 fue escogida")
            print("Digita tu apellido: ")
            apellido = readLine()
        }
        3 -> {
            println("La opción 3 fue escogida")
            print("Digita tu edad: ")
            edad = readLine()?.toIntOrNull()
        }
        else -> {
            println("Ninguna opción válida fue escogida")
        }
    }

    // Opcional: Imprimir los valores ingresados para verificar
    println("Nombre: $nombre")
    println("Apellido: $apellido")
    println("Edad: $edad")
}
