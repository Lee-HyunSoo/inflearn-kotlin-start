package control

fun validateScoreIsNotNegative(score: Int): Unit {
    if (score < 0) {
        throw IllegalArgumentException("${score} 는 0보다 작을 수 없습니다.")
    }
}

fun getPassOrFail(score: Int): String {
    if (score >= 50) {
        return "P"
    } else {
        return "F"
    }
}

fun getPassOrFail2(score: Int): String {
    return if (score >= 50) {
        "P"
    } else {
        "F"
    }
}

fun getGrade(score: Int): String {
    return if (score >= 90) {
        "A"
    } else if (score >= 80) {
        "B"
    } else if (score >= 70) {
        "C"
    } else {
        "D"
    }
}

fun validateScore(score: Int) {
    if (score in 0..100) {
        println("score 가 0 ~ 100 사이에 있습니다.")
    }

    if (score !in 0..100) {
        throw IllegalArgumentException("Score의 범위는 0 ~ 100 입니다.")
    }
}