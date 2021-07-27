package one.digitalinnovation.collections.teste

import one.digitalinnovation.collections.Funcionario
import one.digitalinnovation.collections.Pessoa
import java.math.BigDecimal

fun main() {
    val pedro = Pessoa(nome = "Pedro Madeira", cpf = "123.456.789-10")
    println(pedro.nome)
    println(pedro.cpf)

    //val joao = Funcionario("Joao Pedro", "123.145.876-42", BigDecimal.valueOf(2000.0))

    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)
}