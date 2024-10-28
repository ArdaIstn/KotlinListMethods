package com.example.kotlinlistmethods.listmethods

fun main() {
    val list = listOf("a", "ab", "c")
    val result = list.find { it == "a" }
    println(result)

    /**
     * it ifadesi,liste içerisinde her bir elemanı  bize verir.
     * Liste içerisindeki herhangi bir elemanı bulmak için find metodu kullanılır.
     * Eğer listede o eleman yoksa bize null dönecektir.
     */
}