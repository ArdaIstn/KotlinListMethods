package com.example.kotlinlistmethods.listmethods

fun main() {
    val list = listOf(1, 1, 3, 4, 5)

    val result = list.filter { it == 1 }
    println(result)

    val result2 = list.filter { it > 3 }
    println(result2)

    /**
     * it ifadesi aynı şekilde bize her bir liste elemanını verir.
     * filter metoduyla,süslü parantezler içerisindeki yer alan koşula göre filtreleme işlemini yapıp bize ayrı bir liste olarak dönecektir.
     */
}