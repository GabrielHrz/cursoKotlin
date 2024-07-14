package POO

//Polimorfismo de sobrecarga de metodos
class Usuario{
    //Propiedades
    fun logar(email : String, password : Int){
        println("Usuario inicio sesion con email : $email y clave: $password")

    }
    fun logar(telefono : Int , password: Int){
        println("Usuario inicio sesion con numero de telefono : $telefono y clave $password")

    }

}

fun main(){
    val jose = Usuario()
    jose.logar(99294545,1234567)

}