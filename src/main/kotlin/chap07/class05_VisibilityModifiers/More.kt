package chap07.class05_VisibilityModifiers.p2


/** 클래스다이어그램 -> Image/가시성 지시자와 클래스의 관계[출처 : Naver bootcourse]**/
// 가시성 지시자와 클래스의 관계 출처
open class Base {
    // Base 클래스에서는 a, b, c, d, e 접근 가능
    private val a = 1 // 외부에서 접근 불가
    protected open val b = 2 // 상속된 class만 접근 가능
    internal val c = 3 // 같은 모듈내에 있으면 접근 가능
    val d = 4 // 가시정 지시자 default 값은 public -> 어디서든 접근 가능

    protected class Nested {
        // Nested 클래스에서는 a, b, c, d, e, f 접근 가능
        public  val e: Int = 5 // public 생략 가능
        private val f: Int = 6
    }
}


class Derived : Base() {
    // Derived 클래스에서는 b, c, d, e 접근 가능
    override val b = 5 // Base 의 'b'는 오버라이딩됨 - 상위와 같은 protected 지시자 
}

class Other(base: Base) {
    // base.a, base.b는 접근 불가 
    // base.c, base.d 접근 가능
    // base.Nested 접근 불가, Nested::e 접근 불가
}