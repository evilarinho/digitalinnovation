package one.digitalinnovation.digionebank

class Gerente2(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String
    ) : Funcionario2(nome = nome, cpf = cpf, salario = salario), Logavel2 {
    override fun calculoAuxilio2(): Double = salario * 0.4
    override fun login(): Boolean = "senha123" == senha
}