package com.example.kotlinlistmethods.listmethods

data class User5(val name: String, val age: Int)

fun main() {
    val users = listOf(
        User5("Alice", 30), User5("Bob", 25), User5("Charlie", 35)
    )

    val result = users.minOf {
        it.age
    }
    println(result)

    val result2 = users.minBy {
        it.age
    }
    println(result2)

    /**
     * Aynı şekilde minOf bize liste içerisindeki en küçük yaşı döndürür.
     * minBy ise en küçük yaşa sahip data class nesnesini bize döndürür.
     */

    /**
     * Çıktısı:
     * 25
     * User5(name=Bob, age=25)
     */

}