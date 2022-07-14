package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente2
import one.digitalinnovation.digionebank.ClienteTipo2

fun main() {
    val jose = Cliente2(
        nome = "José da Silva",
        cpf = "123.123.456-77",
        clienteTipo2 = ClienteTipo2.PF,
        senha = "12345"
    )

    println(jose)

    TesteAutenticacao2().autentica(jose)
}

