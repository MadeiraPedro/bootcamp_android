package one.digitalinnovation.collections.teste

import one.digitalinnovation.collections.Analista
import one.digitalinnovation.collections.Funcionario
import one.digitalinnovation.collections.Gerente
import one.digitalinnovation.collections.Pessoa
import java.math.BigDecimal

fun main() {
    val pedro = Gerente("Pedro Madeira", "123.879.657-90", 5000.0)
    ImprimeRelatorioFuncionario.imprime(pedro)
}