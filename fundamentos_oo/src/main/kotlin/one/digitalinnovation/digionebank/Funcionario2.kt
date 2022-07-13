package one.digitalinnovation.digionebank

import java.math.BigDecimal

abstract class Funcionario2(
    override val nome: String,
    override val cpf: String,
    val salario: Double
) : Pessoa2(nome, cpf) {
    protected abstract fun calculoAuxilio2(): Double

    override fun toString(): String = """
            Nome: $nome
            CPF: $cpf
            Salário: $salario
            Auxílio: ${calculoAuxilio2()}
    """.trimIndent()
}
