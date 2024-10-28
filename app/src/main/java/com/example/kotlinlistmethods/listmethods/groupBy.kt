package com.example.kotlinlistmethods.listmethods

fun main() {
    val list = listOf("a", "a", "c")

    val result = list.groupBy { it == "a" }
    println(result)

    /**
     * İçerisinde a harfi olanları gruplamamızı sağlar ve çıktı olarak bir map döner.
     * Bu örnek için result,Map<Boolean, List<String>> şeklinde döner.
     * İçerisinde a olanları true,olmayanları ise false şeklinde bize geri döner.
     * .keys dersek sadece true ve false, .values dersek ise onlara karşılık gelen değerleri almış oluruz.
     */

    /**
     * Çıktısı
     * {true=[a, a], false=[c]}
     */

}