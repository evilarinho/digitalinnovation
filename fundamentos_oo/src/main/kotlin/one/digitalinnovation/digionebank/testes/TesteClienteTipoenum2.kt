package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.ClienteTipo2

fun main() {
    ClienteTipo2.values().forEach { elemento ->
        println("${elemento.name} - ${elemento.descricao}")
    }

    ClienteTipo2.values().forEach {
        println("${it.name} - ${it.descricao}")
    }

    val pf = ClienteTipo2.PF
    println(">> ${pf.name} - ${pf.descricao}")

    val pj = ClienteTipo2.PJ
    println(">> ${pj.name} - ${pj.descricao}")
}