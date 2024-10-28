package com.example.kotlinlistmethods.listmethods

data class User3(val name: String, val age: Int)

fun main() {

    val users = listOf(
        User3("Arda", 25), User3("Ahmet", 30), User3("Mehmet", 20)
    )

    val result = users.sumOf {
        it.age
    }
    println(result)

    /**
     * sumOf metoduyla birlikte de,verilen listenin(users) içerisindeki nesnelerin age bilgilerini toplayıp bir değişkene atayabiliriz.
     * sumOf metodu da sum metodu gibi bize Int geri  dönecektir.
     */

    /**
     * Çıktısı:
     * 75
     */

}