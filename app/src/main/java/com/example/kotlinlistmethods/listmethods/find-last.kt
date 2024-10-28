package com.example.kotlinlistmethods.listmethods

fun main() {
    val list = listOf("a", "ab", "c")
    val result = list.firstOrNull()
    val result2 = list.lastOrNull()
    println(result)
    println(result2)


    /**
     * first listedeki ilk elemanı,last ise listedeki son elemanı bize geri döner.
     * Servisten veya local bir databasede veri çekiyorsak ve bu liste olarak gelecekse
     * firstOrNull veya lastOrNull kullanımı daha mantıklı olacaktır.
     */
}