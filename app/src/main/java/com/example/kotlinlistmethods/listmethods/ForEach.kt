package com.example.kotlinlistmethods.listmethods

fun main() {
    val list = listOf(1, 2, 3, 4, 5)

    list.forEach {
        println(it)
    }

    /**
     * Liste içerisindeki elemanları tek tek almamız sağlar.
     * it ifadesi listedeki her bir elemanı temsil eder.
     */

    /**
     * Çıktısı
     * 1
     * 2
     * 3
     * 4
     * 5
     */

}