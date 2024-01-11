package nestedClass

class House2(
    private val address: String,
    private val livingRoom: LivingRoom
) {
    inner class LivingRoom( // 외부 클래스에 대한 참조를 위한 inner
        private val area: Double
    ) {
        val address: String
            get() = this@House2.address
    }
}