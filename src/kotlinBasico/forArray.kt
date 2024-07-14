package kotlinBasico

fun main(){

    val postagem = arrayOf("Viagem para a praia","Levei meu cachorro no veterinario", "Trilha com amigos")

    for ((indice,mensaje) in postagem.withIndex()){
        println("Indice $indice con el mensaje : $mensaje")


    }




}