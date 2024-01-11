package scopeFunction

fun printPerson(person: Person?) {
    if (person != null) {
        println(person.name)
        println(person.age)
    }
}

fun printPerson2(person: Person?) {
    person?.let {
        println(it.name)
        println(it.age)
    }
}

fun main() {
    val person = Person("test", 100)

    val value1 = person.let {
        it.age
    }
    val value1_1 = person.let {
        p -> p.age
    }

    val value2 = person.run {
        this.age
    }
    val value2_2 = person.run {
        age
    }

    val value3 = person.also {
        it.age
    }
    val value3_3 = person.also {
        p -> p.age
    }

    val value4 = person.apply {
        this.age
    }
    val value4_4 = person.apply {
        age
    }

    val person2 = Person("test", 100)
    with(person) {
        println(name)
        println(this.age)
    }
}