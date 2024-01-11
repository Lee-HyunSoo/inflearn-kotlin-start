package dto

fun handleCountry(country: Country) {
    when (country) {
        Country.KOREA -> TODO()
        Country.AMERICA -> TODO()
//        else -> TODO() // when 에서 enum 을 소괄호 값으로 받을 때는 어차피 country 값을 알고 있기 때문에 else 가 필요 없다.
    }
}

enum class Country(
    private val code: String,
) {
    KOREA("KO"),
    AMERICA("US")
}