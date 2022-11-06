//package com.example.android_teachmeskills
//
//class DataClassKotlin {
//
//    lateinit var wallet: Wallet
//
//    companion object {
//        @JvmStatic
//        fun main(args: Array<String>) {
//
//            val county1 = Country1("Minsk", "Afa")
//            val county2 = Country2("Brest", "XZ")
//
//            println(county1)// результат значений
//            println(county2)// ссылка на объект в хешкоде
//
//
//            val dataClassKotlin = DataClassKotlin()
//
//            repeat(10) {
//                val random = (1..2).random()
//                if (random == 2) {
//                    dataClassKotlin.wallet = Wallet.Dollar(10, 1)
//                } else {
//                    dataClassKotlin.wallet = Wallet.Euro(20, 2)
//                }
//
//                when(dataClassKotlin.wallet){
//                    is Wallet.Dollar -> {
//                        println((dataClassKotlin.wallet.buy as Wallet.Dollar).buy.toString() + "Это доллар" )
//                        println((dataClassKotlin.wallet.sell as Wallet.Dollar).sell )
//
//                    }
//                    is Wallet.Euro -> {
//                        println((dataClassKotlin.wallet.buy as Wallet.Euro).buy.toString() + "Это еуро" )
//                        println((dataClassKotlin.wallet.sell as Wallet.Euro).sell )
//                    }
//                }
//
//
//
//            }
//
//
//        }
//
//
//    }
//
//
//}
//
//
//data class Country1(val city: String, val address: String)
//
//class Country2(val city: String, val address: String)
//
//sealed class Wallet {
//    data class Euro(val buy: Int, val sell: Int) : Wallet()
//
//    data class Dollar(val buy: Int, val sell: Int) : Wallet()
//
//
//}