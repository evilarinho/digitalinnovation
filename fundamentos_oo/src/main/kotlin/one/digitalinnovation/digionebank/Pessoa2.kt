package one.digitalinnovation.digionebank

class Pessoa2 {
    var nome: String = "Edilson"
    var cpf: String = "123.123.123-00"
    private set
}

fun main() {
    val edilson = Pessoa2()

    //edilson.cpf = "9999"

    println("Nome: " + edilson.nome)
    println("CPF: " + edilson.cpf)
}