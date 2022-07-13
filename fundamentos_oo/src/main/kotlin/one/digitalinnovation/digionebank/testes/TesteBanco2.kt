package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Banco2

fun main() {
    val digiOneBank = Banco2("DigiOne",12)

    println(digiOneBank.nome)
    println(digiOneBank.numero)

    val banco2 = digiOneBank.copy(nome = "BancoX")

    println(banco2.nome)
    println(banco2.numero)

    println(digiOneBank.info())
    println(banco2.info())
}