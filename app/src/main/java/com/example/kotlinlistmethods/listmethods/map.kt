package com.example.kotlinlistmethods.listmethods

data class User(val name: String, val age: Int)
data class UserUI(val name: String)

fun main() {

    val users = listOf(
        User("Arda", 25), User("Mehmet", 30), User("Ahmet", 35)
    )
    val mappedUsers = users.map {
        UserUI(it.name)
    }
    println(mappedUsers)

    val ageList = users.map {
        it.age
    }
    println(ageList)

    val nameList = users.map {
        it.name
    }
    println(nameList)

    /**
     * User classında eğer age'a ihtiyacımız yoksa,bu classı UI için oluşturduğumuz data classa dönüştürmemizi sağlar.
     * Bu sayede yeni bir liste oluştururuz fakat bu listede sadece name bilgileri bulunur.
     * Yani burda,mapin içerisinde belirttiğimiz türde bir liste oluşur.
     */

    /**
     * Çıktısı:
     * [UserUI(name=Arda), UserUI(name=Mehmet), UserUI(name=Ahmet)]
     * [25, 30, 35]
     * [Arda, Mehmet, Ahmet]
     */


}
