package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente2


fun main() {
    val maria = Gerente2("Maria do Carmo","123456789", salario = 5000.0, "senha125")
    ImprimeRelatorioFuncionario2.imprime(maria)

    TesteAutenticacao2().autentica(maria)
}


