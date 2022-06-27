package chap08;

public class KCustomerAccess {
    public static void main(String[] args) {
        // 코틀린 클래스의 Companion Object 접근
        System.out.println(KCustomer.LEVEL);
        KCustomer.login(); // @JvmStatic Annotation 사용할 때 접근 방법
        KCustomer.Companion.login(); // 위와 동일한 결과로 @JvmStatic Annotation 사용하지 않을 때 접근방법
    }
}
