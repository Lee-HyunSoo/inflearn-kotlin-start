package inheritance

class Penguin3(
    species: String
) : Animal(species, 2), Swimable2, Flyable {

    private val wingCount: Int = 2

    override fun move() {
        println("펭귄 움직임")
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount

    override fun act() {
        super<Swimable2>.act()
        super<Flyable>.act()
    }

    override val swimAbility: Int
        get() = 3
}