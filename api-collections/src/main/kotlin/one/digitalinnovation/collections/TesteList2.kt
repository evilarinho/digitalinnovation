package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario2(nome = "Joao", salario = 2000.0, tipoContratacao = "CLT")
    val pedro = Funcionario2(nome = "Pedro", salario = 1500.0, tipoContratacao = "PJ")
    val maria = Funcionario2(nome = "Maria", salario = 4000.0, tipoContratacao = "CLT")

    val funcionarios = listOf(joao, pedro, maria)

    funcionarios.forEach { println(it) }

    println("==========================")
    println(funcionarios.findLast { it.nome == "Maria" })

    println("++++++++++++++++++++++++++")
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }

    println("++++++++++++++++++++++++++")
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach { println(it) }
}