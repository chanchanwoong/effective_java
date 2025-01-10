package chapter02.item06;

/*
    오토 박싱과 기본 타입의 성능 비교
    - 오토 박싱이 훨 느린 것을 확인할 수 있다.

    래퍼 객체를 이용한 처리 시간 : 29 ms
    기본 타입을 이용한 처리 시간 : 5 ms

    - 다음 상황이 아니라면 기본 타입을 사용하는 것이 좋을 것 같다.
    -- NULL 처리, 래퍼 클래스의 메서드 사용, 제네릭 명시
 */

public class AutoBoxingPerformanceTest {

    public static void main(String[] args) {
        Long rapperSum = 0L;  // 래퍼 객체 생성
        long primitiveSum = 0;  // 기본 정수형 타입

        long t = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            rapperSum += i;
        }

        System.out.println("래퍼 객체를 이용한 처리 시간 : " + (System.currentTimeMillis() - t) + " ms");

        t = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            primitiveSum += i;
        }

        System.out.println("기본 타입을 이용한 처리 시간 : " + (System.currentTimeMillis() - t) + " ms");
    }
}
