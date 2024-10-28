package com.example.kotlinlistmethods.listmethods

fun main() {
    val list = listOf("a", "b", "c")

    val result = list.shuffled()
    println(list)
    println(result)

    /**
     * Listenin sıralamasını değiştirip,bize bir liste şeklinde geri döner.
     */

    /**
     * Çıktısı
     * [b, c, a]
     * Kodu her çalıştırdığımzda farklı bir sırayla çıktı verir.
     */
}