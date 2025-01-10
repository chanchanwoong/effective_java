package chapter02.item06;

/*
    박싱과 언박싱
    - 박싱은 기본 타입을 래퍼 클래스의 객체로 변환하는 것을 의미
    - 언박싱은 래퍼 클래스 객체를 기본 타입으로 변환하는 것을 의미

    오토 박싱과 오토 언박싱
    - 오토 박싱은 일반적인 객체처럼 new 키워드를 통해서 래퍼 클래스 객체를 만들지 않고 값을 지정하여 래퍼 클래스 객체를 만드는 것을 의미
    - 오토 언박싱은 래퍼 클래스 객체를 기본 타입으로 변환해주는 것을 의미
 */

public class BoxingTest {

    public static void main(String[] args) {
        // 박싱이지만, 현재는 deprecated
//        Integer num = new Integer(10);
        Integer num = 10;

        // 언박싱
        int n = num.intValue();

        // 오토 박싱
        Integer autoBoxingNum = 15;

        // 오토 언박싱
        int autoUnboxingNum = autoBoxingNum;

        System.out.println("autoBoxingNum = " + autoBoxingNum + ", autoUnboxingNum = " + autoUnboxingNum);
    }
}