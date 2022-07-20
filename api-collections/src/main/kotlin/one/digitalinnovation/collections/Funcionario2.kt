package one.digitalinnovation.collections

data class Funcionario2(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
) {
    override fun toString(): String =
        """
            
            Nome:    $nome
            Salário: $salario                     
        """.trimIndent()
}
