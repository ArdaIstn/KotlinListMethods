package com.example.kotlinlistmethods.listmethods

fun main() {
    val list = listOf("a", "b", "c")

    val result = list.reversed()
    println(list)
    println(result)

    /**
     * Verilen Listenin tersten sıralanmışını alıp bize bir liste şeklinde geri döner.
     */

    /**
     * Çıktısı:
     * [a, b, c]
     * [c, b, a]
     */
}