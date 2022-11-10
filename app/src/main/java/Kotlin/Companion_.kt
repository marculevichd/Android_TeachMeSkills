package Kotlin

class Companion_ {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val firstC = FirstC().navigate()
            val fircstC2 =
                FirstC.walk()// companion object не нужен экземпляр класса, так что вызов метод возможен через вызов класса
            // похож на static
        }
    }


}


class FirstC {
    fun navigate() {
        print("navigating \n")
    }

    companion object {
        fun walk() {
            print("walk")
        }

    }


}
