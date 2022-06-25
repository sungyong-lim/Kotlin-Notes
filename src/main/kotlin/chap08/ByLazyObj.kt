package chap08.p5

class Person(val name: String, val age: Int)

fun main() {
    var isPersonInstantiated: Boolean = false // 1. 초기화 확인 용도 
    
    val person : Person by lazy { // 2. lazy를 사용한 person 객체의 지연 초기화 
        isPersonInstantiated = true
        Person("Lim", 26) // 3. Lazy 객체로 반환 
    }
    
    val personDelegate = lazy { Person("Kim", 36) } // 4. 위임 변수를 사용한 초기화

    println("person Init: $isPersonInstantiated")
    println("personDelegate Init: ${personDelegate.isInitialized()}")

    println("person.name: ${person.name}") // 5. 이 시점에서 초기화

    // personDelegate는 객체가 아니고 위임 변수 이기 때문에 value로 한번 진입하고 name으로 진입한다
    println("personDelegate.value.name: ${personDelegate.value.name}") // 6. 이 시점에서 초기화

    println("person Init: $isPersonInstantiated")
    println("personDelegate Init: ${personDelegate.isInitialized()}")


    
}
