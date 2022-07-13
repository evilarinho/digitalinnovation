package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario2
import one.digitalinnovation.digionebank.Pessoa2
import java.math.BigDecimal

fun main() {
    val edilson = Pessoa2(nome = "Edilson Vilarinho", cpf = "123456789")
    println("Nome: " + edilson.nome)
    println("CPF: " + edilson.cpf)

    val joao = Funcionario2( "Edilson Vilarinho",   "123456789", BigDecimal.valueOf(2000.0))
    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)
}

