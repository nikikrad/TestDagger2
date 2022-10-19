package com.example.testdagger2

class Name{
    override fun toString() = "Nikita"
}

class Job{
    override fun toString() = "Programmer"
}

class Studies{
    override fun toString() = "BSUIR"
}

data class Nikita(
    var name: Name,
    var job: Job,
    var studies: Studies
)
