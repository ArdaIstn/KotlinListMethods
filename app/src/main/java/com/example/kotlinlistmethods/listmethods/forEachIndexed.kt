package com.example.kotlinlistmethods.listmethods

fun main() {
    val list = listOf(1, 2, 3, 4, 5)

    list.forEachIndexed { index, value ->
        println("Index: $index, Value: $value")
    }

    /**
     * Bazı durumlarda indexlerine de ihtiyacımız olabilir.
     * Index ve ona karşılık gelen sayıları almamız sağlar.
     */
}