package Kotlin

class Lesson17 {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val first1 = First()
            val first2 = First()

            val second1 = Second// здесь экземляр ну нужен
            val second2 = Second

            println("${first1.hashCode()} ${first2.hashCode()}")
            first1.navigate()
            first2.navigate()
            println("${second1.hashCode()} ${second2.hashCode()}")// здесь одинаковый хешкод
            second1.navigate()
            second2.navigate()

        }
    }
}


class First {
    fun navigate() {
        print("navigating \n")
    }
}


object Second { // при этом не моет иметь конструктор
    fun navigate() {
        print("navigating \n")
    }
}

