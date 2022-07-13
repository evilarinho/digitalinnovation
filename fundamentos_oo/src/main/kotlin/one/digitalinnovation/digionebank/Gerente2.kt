package one.digitalinnovation.digionebank

class Gerente2(
    nome: String,
    cpf: String,
    salario: Double)
    : Funcionario2(nome = nome, cpf = cpf, salario = salario) {
    override fun calculoAuxilio2(): Double = salario * 0.4
}