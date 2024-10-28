package com.example.kotlinlistmethods.listmethods

data class User2(val name: String, val age: Int)

fun main() {
    val users = listOf(
        User2("Arda", 25), User2("Ahmet", 30), User2("Mehmet", 20)
    )

    val result = users.sortedBy {
        it.age
    }
    val result2 = users.sortedByDescending {
        it.age
    }

    val result3 = users.sortedBy {
        it.name
    }
    val result4 = users.sortedByDescending {
        it.name
    }

    println(result)
    println(result2)
    println(result3)
    println(result4)


    /**
     * sortedBy küçükten büyüğe doğru sıralayıp bize bir liste döner.
     * sortedByDescending ise büyükten küçüğe doğru sıralayıp bize bir liste döner.
     *
     */

    /**
     * Çıktısı:
     * [User2(name=Mehmet, age=20), User2(name=Arda, age=25), User2(name=Ahmet, age=30)]
     * [User2(name=Ahmet, age=30), User2(name=Arda, age=25), User2(name=Mehmet, age=20)]
     * [User2(name=Ahmet, age=30), User2(name=Arda, age=25), User2(name=Mehmet, age=20)]
     * [User2(name=Mehmet, age=20), User2(name=Arda, age=25), User2(name=Ahmet, age=30)]
     */
}