package calculator

class Calculator {
    val math = Math()
    val menu: String =
        "0. Выход\n" +
                "1. Сложение\n" +
                "2. Вычетание\n" +
                "3. Умножение\n" +
                "4. Деление\n"

    fun calculator(operation: Operations): Int {

        val valOne = readln().toInt()
        val valTwo = readln().toInt()



        return when (operation) {
            Operations.Addition -> {
                math.add(valOne, valTwo)
            }

            Operations.Subtraction -> TODO()
            Operations.Multiplication -> TODO()
            Operations.Division -> TODO()
        }

    }
}