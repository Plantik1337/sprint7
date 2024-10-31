package calculator

class Calculator {
    val math = Math()
    val menu: String =
        "0. Выход\n" +
                "1. Сложение\n" +
                "2. Вычетание\n" +
                "3. Умножение\n" +
                "4. Деление\n"

    fun calculate(operation: Operations): Int {

        val valOne = getNumber()
        val valTwo = getNumber()

        return when (operation) {
            Operations.Addition -> {
                math.add(valOne, valTwo)
            }

            Operations.Subtraction -> {
                math.sub(valOne, valTwo)
            }
            Operations.Multiplication -> {
                math.multiply(valOne, valTwo)
            }

            Operations.Division -> {
                math.division(valOne, valTwo).toInt()
            }
        }

    }

    private fun getNumber(): Int{
        while(true){
            println("Введите число")
            val number = readlnOrNull()?.toIntOrNull()

            if(number == null)
                println("Некорректное значение")
            else return number
        }
    }
}