package ktobject

class Person2 private constructor(
    var name: String,
    var age: Int
) {
    companion object Factory : Log { // 동행 객체, Factory 라는 이름을 붙였다.
        private const val MIN_AGE = 1
        fun newBaby(name: String): Person2 {
            return Person2(name, MIN_AGE)
        }

        override fun log() {
            println("Person2 클래스의 동행 객체")
        }
    }
}