package inheritance

class Cat(
    species: String
) : Animal(species, 4) {

    override fun move() {
        println("고양이 걷기")
    }
}