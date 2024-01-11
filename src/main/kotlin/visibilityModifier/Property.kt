package visibilityModifier

class Car(
    internal val name: String, // getter, setter 를 internal 으로
    private var owner: String, // getter, setter 를 private 으로
    _price: Int
) {
    var price = _price
        private set // setter 만 private
}