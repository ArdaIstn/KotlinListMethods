package com.example.kotlinlistmethods.listmethods

fun main() {
    val list = listOf("a", "a", "c")

    val result = list.groupBy { it == "a" }.values
    println(result)

    /**
     * İçerisinde a harfi olanları gruplamamızı sağlar ve çıktı olarak bir map döner.
     * İçerisinde a olanları true,olmayanları ise false şeklinde bize geri döner.
     * .keys dersek sadece true ve false,.values dersek ise onlara karşılık gelen değerleri almış oluruz.
     *
     */

}