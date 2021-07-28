package one.digitalinnovation.collections.teste

import one.digitalinnovation.collections.Cliente
import one.digitalinnovation.collections.ClienteTipo

fun main() {
    val jose = Cliente(
        nome = "Jose da Silva",
        cpf = "123.456.789-10",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )

    println(jose)

    TesteAutenticacao().autentica(jose)
}