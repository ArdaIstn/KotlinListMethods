package com.example.kotlinlistmethods.listmethods

data class User4(val name: String, val age: Int)

fun main() {

    val users = listOf(
        User4("Alice", 25), User4("Bob", 30), User4("Charlie", 35)

    )
    val result = users.maxOf {
        it.age
    }
    val result2 = users.maxBy {
        it.age
    }
    println(result)
    println(result2)


    /**
     * maxOf metodu bu örnekten yola çıkarsak,users listesindeki en büyük yaşı bize geri döndürür.
     * maxBy metodu ise users listesindeki en büyük yaşa sahip data class nesnesini bize geri dönüdürür,item'ın kendisini döndürür.
     */

    /**
     * Çıktısı:
     * 35
     * User4(name=Charlie, age=35)
     */

}