package ru.netology

fun main() {
    val card = "VK Pay"
    var summMonth = 100
    val mount = 1_000_000
    val commission = comissim(card, mount, summMonth)
    println(
        "По карте $card сумма переводов за месяц составила : $summMonth. Сумма совершаемого перевода : $mount. " +
                "Коммиссия: $commission "
    )
}

fun comissim(card: String = "VK Pay", summMonth: Int = 0, mount: Int): Int {
    var commission = 0
    commission = when (card) {
        "MasterCard", "Maestro" ->
            when {
                (mount + summMonth) in 300..75000 -> 0
                else -> (mount * 0.06 + 20).toInt()
            }
        "Visa", "Mir" -> when {
            mount * 0.75 < 35 -> 35
            else -> (mount * 0.75).toInt()
        }
        else -> 0
    }
    return (commission)
}


