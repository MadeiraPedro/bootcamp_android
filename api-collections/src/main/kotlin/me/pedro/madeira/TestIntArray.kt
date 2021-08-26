package me.pedro.madeira

fun main() {
    val values = IntArray(5)

    values[0] = 5
    values[1] = 7
    values[2] = 9
    values[3] = 0
    values[4] = 1

    for(valor in values){
        println(valor)
    }

    println("==============================================")

    values.forEach {
        println(it)
    }

    println("==============================================")

    for(index in values.indices){
        println(values[index])
    }

    println("==============================================")

    values.sort()

    for(valor in values){
        println(valor)
    }

}