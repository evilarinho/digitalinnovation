package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista2

fun main() {
    val joao = Analista2("Edilson Vilarinho","123456789", salario = 2000.0)
    ImprimeRelatorioFuncionario2.imprime(joao)
}
