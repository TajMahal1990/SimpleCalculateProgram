fun main() {
    try {
        println("Введи первое число: ")
        var a: Int? = readln().toIntOrNull()
        if(a == null) {
            throw NumberFormatException ("Ошибка: вы ввели недопустимое значение")
        }
        println("Введи первое число: ")
        var b: Int? = readln().toIntOrNull()
        if(b == null) {
            throw NumberFormatException ("Ошибка: вы ввели недопустимое значение")
        }
        println("Введи знак действия(+, -, *, /): ")
        var action: String? = readln()
        if(action != null) {
            when(action) {
                "+" -> println("$a + $b = ${summing(a, b)}")
                "-" -> println("$a - $b = ${minus(a, b)}")
                "*" -> println("$a * $b = ${umnoj(a, b)}")
                "/" -> if (b == 0) {
                    throw Exception ("Ошибка: вы пытались вввести о как второе число")
                } else println("$a / $b = ${delit(a, b)}")
            }
        } else ("Вы ввели недопустимый знак")
    } catch (e: NumberFormatException) {
        println("ВНИМАНИЕ: ${e.message}")
    } catch (e: Exception) {
        println("ВНИМАНИЕ: ${e.message}")
    }
}
fun summing(a: Int, b: Int): Int {
    return a +b
}
fun minus(a: Int, b: Int): Int {
    return a - b
}
fun umnoj(a: Int, b: Int): Int {
    return a * b
}
fun delit(a: Int, b: Int): Int {
    return a / b
}