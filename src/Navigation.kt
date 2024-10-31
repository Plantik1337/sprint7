import calculator.Calculator
import calculator.Operations

class Navigation {
    fun printList(list: List<String>) {
        for (i in list) {
            println(i)
        }
    }

    fun startCalculator(calculator: Calculator) {
        while (true) {
            println(calculator.menu)
            val input = readlnOrNull()?.toIntOrNull()
            when (input) {
                0 -> break
                1 -> {
                    println("Выбрали сложение")
                    val answer = calculator.calculator(Operations.Addition)
                    println(answer)
                }

                2 -> println("Выбрали вычитание")
                3 -> println("Выбрали умножение")
                4 -> println("Выбрали деление")
                null -> println("Ошибка")
                else -> println("Такого варианта нет")

            }
        }
    }
}