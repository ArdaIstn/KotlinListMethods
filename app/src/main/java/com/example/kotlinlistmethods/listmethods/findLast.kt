package com.example.kotlinlistmethods.listmethods

fun main() {
    val list = listOf("a", "ab", "c")
    val result = list.findLast { it.contains("a") }
    println(result)

    /**
     * Bu metodda ise,liste içerisindeki tüm elemanları gezer ve son a içeren elemanı bize geri döner.
     *
     */

    /**
     * Çıktısı:
     * ab
     */
}