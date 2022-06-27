package chap08

/** @JvmStatic **/
// - 자바에서는 코틀린 Companion Object를 접근하기 위해 @JvmStatic Annotation 표기법을 사용


class KCustomer {
    companion object {
        const val LEVEL = "INTERMEDIATE"
        @JvmStatic fun login() = println("Login...")
    }
}

