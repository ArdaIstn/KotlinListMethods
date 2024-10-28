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

    /**
     * Çıktısı:
     * Index: 0, Value: 1
     * Index: 1, Value: 2
     * Index: 2, Value: 3
     * Index: 3, Value: 4
     * Index: 4, Value: 5
     *
     */
}