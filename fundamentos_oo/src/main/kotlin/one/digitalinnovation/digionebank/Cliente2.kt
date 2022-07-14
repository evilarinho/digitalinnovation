package one.digitalinnovation.digionebank

class Cliente2(
    nome: String,
    cpf: String,
    val clienteTipo2: ClienteTipo2,
    val senha: String
) : Pessoa2(nome, cpf), Logavel2 {
    override fun login(): Boolean = "123456" == senha

    override fun toString(): String = """
        Nome:       $nome
        CPF:        $cpf
        Tipo:       ${clienteTipo2.descricao}        
    """.trimIndent()
}