package one.digitalinnovation.collections.teste

import one.digitalinnovation.collections.Analista

fun main() {
    val joao = Analista("Joao Pedro", "123.879.657-90", 2000.0)
    ImprimeRelatorioFuncionario.imprime(joao)
}
