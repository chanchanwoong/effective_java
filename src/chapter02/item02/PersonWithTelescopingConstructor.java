package chapter02.item02;

/*
    점층적 생성자 패턴
    - 객체를 생성할 때, 선택적 매개변수 만큼의 생성자를 두는 방식

    점층적 생성자 패턴의 문제점
    - 해당 방식은 선택적 매개변수 수가 많으면 가독성 및 확장성이 떨어지기 때문에 피하는 것이 좋다.
 */

public class PersonWithTelescopingConstructor {

    private String name;
    private int age;
    private String address = "KOREA";

    // 이름과 나이 받는 생성자
    public PersonWithTelescopingConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 이름, 나이, 주소 받는 생성자
    public PersonWithTelescopingConstructor(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }


    public static void main(String[] args) {
        // 27살 찬웅
        PersonWithTelescopingConstructor person1 = new PersonWithTelescopingConstructor("찬웅", 27);

        // 서울 강남에 사는 27살 찬웅
        PersonWithTelescopingConstructor person2 = new PersonWithTelescopingConstructor(
                "찬웅", 27, "서울 강남");
    }
}
