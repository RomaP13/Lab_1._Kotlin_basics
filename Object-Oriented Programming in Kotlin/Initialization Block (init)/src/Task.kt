class Product(val price: Double) {
    init {
        // Перевіряємо умову
        if (price < 0) {
            throw IllegalArgumentException("Price cannot be negative")
        }
    }
}
