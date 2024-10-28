package com.example.kotlinlistmethods.listmethods

data class User3(val name: String, val age: Int)

fun main() {

    val numbers = listOf(1, 2, 3, 4, 5)

    val sum = numbers.sum()
    println(sum)

    /**
     * sum metodu,verilen listenin tüm elemanlarını toplayıp bize Int olarak geri döndürür.
     */

}