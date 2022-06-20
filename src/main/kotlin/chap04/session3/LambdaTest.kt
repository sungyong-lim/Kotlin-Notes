package chap04.session3

// 람다식 함수의 매개변수가 1개도 없는 경우
fun noParam(out: () -> String) = println(out())

// 람다식 함수의 매개변수가 1개만 있는 경우
fun oneParam(out: (String) -> String) = println(out("OneParam"))

// 람다식 함수의 매개변수가 2개 이상 있는 경우
fun moreParam(out: (String, String, String) -> String) = println(out("oneParam", "twoParam", "threeParam"))

// 일반 매개변수와 람다식 매개변수가 같이 사용되는 경우 --> 람다식은 가장 뒤에 사용하는 것이 단순화하기 편함
fun withArgs(x:String, y:String, out: (String, String) -> String) = println(out(x, y))

//람다식 매개변수가 2개 이상인 경우
fun moreLambda(first: (String, String) -> String, second: (String) -> String, third: () -> String) {
    println(first("oneParam", "twoParam"))
    println(second("oneParam"))
    println(third())
}


fun main() {

    noParam { "NoParam" }

    oneParam { "Lambda $it" } //매개변수가 1개만 사용할때는 "it"으로 대체 가능

    moreParam{x, y, z -> "MoreParam => $x, $y, $z"}

    moreParam{x, _, z -> "Not y Param -> $x, $z"} //매개변수를 사용하지 않을 경우 인자를 "_"로 작성

    // 일반 변수와 람다식 매개변수가 같이 사용되는 경우에는 람다식은 (일반 인자)뒤에 {람다식} 사용가능
    // 단, 함수 선언시 람다식 매개변수가 제일 뒤에 작성되어야 함
    withArgs("OneParam", "TwoParam") {x, y -> "$x, $y"}

    //람다식 매개변수가 2개 이상인 경우에는 첫번쩨 람다식은 ({})안에 표기 두번째는 {}에 사용 가능 ex) func({first}){second}
    // 세개 있으면 ({}, {}) {} 이런식으로 사용 가능 ex func({first},{second}){third}
    moreLambda({x, y -> "First => $x, $y"}, {"Second => $it"}) {"Third => Not Param"}



}