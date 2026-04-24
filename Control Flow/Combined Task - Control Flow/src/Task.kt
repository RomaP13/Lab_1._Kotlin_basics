fun fizzBuzz(n: Int): String {
    var result = ""
    for (i in 1..n) {
        val element = when {
            i % 15 == 0 -> "FizzBuzz"
            i % 3 == 0 -> "Fizz"
            i % 5 == 0 -> "Buzz"
            else -> "$i"
        }
        result += "$element "
    }

    return result
}