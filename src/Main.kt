fun main() {
    println(
        "0. Выход\n" +
                "1. Калькулятор\n" +
                "2.\n" +
                "3.\n" +
                "4.\n"
    )
    while (true) {
        when (val input = readlnOrNull()?.toIntOrNull()) {

            0 -> {
                break
            }

            null -> {
                println("Ошибка")
            }

            else -> {
                println("Вы ввели $input")
            }
        }
    }
}