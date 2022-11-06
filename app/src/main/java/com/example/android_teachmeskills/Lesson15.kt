//package com.example.android_teachmeskills
//
//const val ZRKJ_WQ_NEKJ = "ZEWRE"// константа. всегда вышел класса. верхний регистр
//
//fun outerFun (){
//    print("I'm outerFun")
//}
//
//
//class Lesson15 {
//
//    val country: String = "Bel"
//    var city = "Minsk"
//    lateinit var address: String  // нельзя сразу инициализировать
//
//
//    companion object {
//        @JvmStatic
//        fun main(args: Array<String>) {
//            print("hello world")
//
//            val kotlinClass: KotlinClass = KotlinClass("aaaa", 1231)
//            val string = kotlinClass.getNameAndAge()
//            print(string)
//
//
//            val lesson15 = Lesson15
////                lesson15.country = "cant change"
//            lesson15.city = "qweq"
//            lesson15.address = "kjwjhhfkj"
//            print("${lesson15.city}") // {} компилятор понимает что значение внутри единое
//
//
//            val kotlinClass2:KotlinClass = KotlinClass("asdasdd", "qweqweqwe", "qweqwe") // создание экземпляра класса через второй констуктор
//
//
//        }
//    }
//    fun emptyFun (): Unit{
//        print("I'm empty Fun")
//    }
//
//    fun boolFun (): Boolean = true  // {return true}
//
//
//}
//
//
//class KotlinClass(val name: String, var age: Int): EweOdinClass(), InterfaceKotlin {
//
//     var country: String = ""
//     var city:String = ""
//     var address:String = ""
//
//
//    constructor():this("",1)// для создания второго конструктора изначально нужен пустой констуктор
//
//
//    constructor(country:String, city:String, address:String):this(){ // это непосредственно второй констуктор
//        this.country = country
//        this.city=city
//        this.address=address
//    }
//
//
//
//
//
//
//
//    fun getNameAndAge(): String {
////        name = ""  нельзя, val - неизменяемое значение
//        age = 1212
//
//        return "$name +=fwjefklwmekl $age"
//    }
//
//    override fun getHairColor() {
//        super.getHairColor()
//    }
//
//    override fun getEyeColor() {
//        TODO("Not yet implemented")
//    }
//
//
//}
//
//
//open class EweOdinClass {
//
//    open fun getHairColor(){
//
//    }
//
//}
//
//
//interface InterfaceKotlin{
//
//    fun getEyeColor()
//
//}