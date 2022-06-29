package one.digitalinnovation.digionebank

class Pessoa2 {
    var nome: String = "Edilson"
    var cpf: String = "123.123.123-00"

    inner class Endereco {
        var rua: String = "Rua Capitão Lima, 286"
    }
}

fun main() {
    val edilson = Pessoa2()

    println(edilson.nome)
    println(edilson.cpf)

    println(edilson.Endereco().rua)
}