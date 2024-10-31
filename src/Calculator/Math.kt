package Calculator

class Math {
    val operationsList = listOf("Сложение", "Вычетание", "Умножение", "Деление")

    fun add(firstValue: Int, secondValue: Int): Int {
        return firstValue + secondValue
    }

    fun sub(firstValue: Int, secondValue: Int): Int {
        return firstValue - secondValue
    }

    fun multiply(firstValue: Int, secondValue: Int): Int {
        return firstValue * secondValue
    }

    fun division(firstValue: Int, secondValue: Int): Double {
        return (firstValue / secondValue).toDouble()
    }
}
