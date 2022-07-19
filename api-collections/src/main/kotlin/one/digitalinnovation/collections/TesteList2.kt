package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario2(nome = "Joao", salario = 1000.0)
    val pedro = Funcionario2(nome = "Pedro", salario = 2000.0)
    val maria = Funcionario2(nome = "Maria", salario = 4000.0)

    val funcionarios = listOf(joao, pedro, maria)

    funcionarios.forEach { println(it) }

    println("==========================")
    println(funcionarios.findLast { it.nome == "Maria" })
}

data class Funcionario2(
    val nome: String,
    val salario: Double
) {
    override fun toString(): String =
        """
            nome:    $nome
            salario: $salario
            --------------------
        """.trimIndent()
}

