package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario2(nome = "Joao", salario = 2000.0, tipoContratacao = "CLT")
    val pedro = Funcionario2(nome = "Pedro", salario = 1500.0, tipoContratacao = "PJ")
    val maria = Funcionario2(nome = "Maria", salario = 4000.0, tipoContratacao = "CLT")

    val repositorio = Repositorio2<Funcionario2>()

    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    //println(repositorio.findById(maria.nome))

    println("------------------------------")
    repositorio.findAll().forEach { println(it) }

    println("------------------------------")
    println("-------- remove Maria --------")
    repositorio.remove(maria.nome)
    repositorio.findAll().forEach { println(it) }
}