fun main() {
    val amount = 15000 //Сумма покупки
    var calcDiscount: Int = 0  //Сумма скидки
    var purchaseCounter: Int = 1  //Счетчик покупок данного клиента
    purchaseCounter++  // Увеличиваем счетчик при каждой покупке
    if (amount <= 1000) {
        calcDiscount = amount
    } else if (amount > 1001 && amount <= 10000) {
        calcDiscount = amount - 100
    } else if (amount > 10001) {
        calcDiscount = amount / 100 * 5
    }
    println(
        if (purchaseCounter > 1) (amount - calcDiscount) - ((amount - calcDiscount) / 100 * 1)
        else amount - calcDiscount
    )

}
