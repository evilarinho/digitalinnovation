package one.digitalinnovation.digionebank

import java.math.BigDecimal

class Analista2(
    nome: String,
    cpf: String,
    salario: Double
    ) : Funcionario2(nome, cpf, salario) {
    override fun calculoAuxilio2() = salario * 0.1
    }