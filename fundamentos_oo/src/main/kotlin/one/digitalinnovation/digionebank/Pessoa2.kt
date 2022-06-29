package one.digitalinnovation.digionebank

class Pessoa2 {
    var nome: String = "Edilson"
    var cpf: String = "123.123.123-00"
    private set

    fun pessoaInfo() = "$nome e $cpf"    // interpolação
}

fun main() {
    val edilson = Pessoa2()

    println("Nome: " + edilson.nome)
    println("CPF: " + edilson.cpf)

    println(edilson.pessoaInfo())
}