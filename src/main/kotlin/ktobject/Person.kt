package ktobject

class Person private constructor(
    var name: String,
    var age: Int
) {
    companion object { // 동행 객체, Factory 라는 이름을 붙였다.
        private const val MIN_AGE = 1

        @JvmStatic
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }
    }
}