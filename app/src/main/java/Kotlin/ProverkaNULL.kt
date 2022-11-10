package Kotlin

class ProverkaNULL {

    val number: Int? = null
    val name: String? = null // ? после типа данных позволяет иметь null значение




    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val values = Values(0)
            println(values.name)





            // способ 1 проверка на null через if-else
            val nullable: Int? = null
            var notNullNullable: Int = 0
            var NullNullable: Int? = 0



            val nullableValues:Int?= nullable
            if(nullableValues!=null){// проверка что не null переменная nullableValues
                notNullNullable = nullableValues // переменная notNullNullable без знака ?
            } else { // переменная notNullNullable с ?
                NullNullable=nullableValues
            }



            // способ 2 проверка через let и лямбду
            nullableValues?.let { notNullNullable=it } // на выходе Int без знака ?

            // способ 3 через элвис оператор ?: т.е. сокращенный вариант if-else
            notNullNullable = nullableValues?:0 // здесь 0 потому что значение переменной nullableValues = null // по сути это значение по умолчанию

            println(notNullNullable)

            // способ 4 !! not null т.е. принудительно сказать компилятору что значение не будет null

//            notNullNullable=nullableValues!! // если nullableValues null будет ошибка

            println(notNullNullable)

            // способ 5

            val outer = Outer(Inner("InnerValue"))
            val value=outer.inner?.value// если есть значение inner = берется значение value, если нет значение =null


        }
    }
}


data class Values(
    val number: Int,
    val name: String?= "net znacheniya" // т.е. это значение по умолчанию// если значение не передано
    )


data class Outer (val inner: Inner?)// может быть null
data class Inner (val value:String)