package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario2(nome = "Joao", salario = 2000.0, tipoContratacao = "CLT")
    val pedro = Funcionario2(nome = "Pedro", salario = 1500.0, tipoContratacao = "PJ")
    val maria = Funcionario2(nome = "Maria", salario = 4000.0, tipoContratacao = "CLT")

    val funcionario2 = mutableListOf(joao, maria)
    funcionario2.forEach { println(it) }

    println("-----------------------------")
    funcionario2.add(pedro)
    funcionario2.forEach { println(it) }

    println("-----------------------------")
    funcionario2.remove(joao)
    funcionario2.forEach { println(it) }

    println("----------- SET -------------")
    val funcionarioSet = mutableSetOf(joao)
    funcionarioSet.forEach{ println(it) }

    println("-----------------------------")
    funcionarioSet.add(pedro)
    funcionarioSet.add(maria)
    funcionarioSet.forEach{ println(it) }

    println("-----------------------------")
    funcionarioSet.remove(maria)
    funcionarioSet.forEach{ println(it) }
}