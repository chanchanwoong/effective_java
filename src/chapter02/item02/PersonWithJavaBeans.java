package chapter02.item02;

/*
    자바 빈즈 패턴
    - 매개 변수가 많을 때, 점진적 생성자 패턴은 코드 가독성 및 확장성이 안 좋았다.
    - 자바 빈즈 패턴의 경우, 기본 생성자와 Setter 메서드를 가지고 객체를 생성한다.

    자바 빈즈 패턴의 문제점
    - 객체 생성과 동시에 초기화가 되지 않아 일관성에 문제가 있다.
    - 객체를 기본 생성자로 생성하고 모든 필드에 대해 초기화 전에 어디선가 사용되어 버리면, 일관성을 잃어버리게 되는 것
    - 무조건 피해야 할 객체 생성 패턴이다.
 */

public class PersonWithJavaBeans {

    private String name;
    private int age;
    private String address = "KOREA";

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public static void main(String[] args) {
        // 서울 강남사는 27살 찬웅
        PersonWithJavaBeans person = new PersonWithJavaBeans();
        person.setName("찬웅");
        person.setAge(27);
        person.setAddress("서울 강남");
    }
}
