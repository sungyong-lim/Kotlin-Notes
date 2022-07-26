package chap08

fun main() {
    val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

    val eager = decorations.filter { it[0] == 'p' }
    println("filterTest : $eager")

    val filtered = decorations.asSequence().filter { it[0] == 'p' }
    println(filtered)
    println("filtered : ${filtered.toList()}")

    val lazyMap = decorations.asSequence().map {
        println("access : $it")
        it
    }
    println("lazy: $lazyMap")
    println("-----")
    println("first: ${lazyMap.first()}")
    println("-----")
    println("all: ${lazyMap.toList()}")

    val lazyMap2 = decorations.asSequence()
        .filter { it[0] == 'p' }
        .map {
            println("access : $it")
            it
        }
    println("-----")
    println("filtered : ${lazyMap2.toList()}")

    val containsFilter = decorations.filter { it.contains('p') }
    println(containsFilter)

}