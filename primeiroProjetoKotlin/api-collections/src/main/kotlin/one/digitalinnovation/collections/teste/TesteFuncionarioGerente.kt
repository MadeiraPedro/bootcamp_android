package one.digitalinnovation.collections.teste

import one.digitalinnovation.collections.Gerente


fun main() {
    val pedro = Gerente("Pedro Madeira", "123.879.657-90", 5000.0, "senha123")
    ImprimeRelatorioFuncionario.imprime(pedro)

    TesteAutenticacao().autentica(pedro)
}