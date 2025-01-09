package chapter02.item02;

/*
    빌더 패턴
    - 필수 매개변수만으로 생성자를 호출해 객체를 생성 및 초기화하는 방식
    - 필수 매개변수만 Builder 생성자를 통해 초기화가 되고, 선택 매개변수는 변수이름과 동일한 setter를 만들어서 Builder를 반환한다.
    - 빌더 패턴을 사용하면 객체의 상태를 명확하게 표현할 수 있어서 가독성이 굉장히 좋다.
    - 또한, 확장 시에 객체의 빌더 클래스에 생성자나 세터를 더 두기만 하면 되어서 확장성도 용이하다.
 */

public class PersonWithBuilder {

    private String name;
    private int age;
    private String address = "KOREA";

    // 빌더 클래스
    public static class Builder {
        // 필수 매개변수
        private String name;
        private int age;

        private String address = "KOREA";

        public Builder(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public PersonWithBuilder build() {
            return new PersonWithBuilder(this);
        }
    }

    private PersonWithBuilder(Builder builder) {
        name = builder.name;
        age = builder.age;
        address = builder.address;
    }

    public String toString() {
        return("name = " + name + ", age = " + age + ", address = " + address);
    }


    public static void main(String[] args) {
        // 27살 찬웅
        PersonWithBuilder person1 = new PersonWithBuilder.Builder("찬웅", 27).build();
        System.out.println(person1.toString());

        // 서울 강남에 사는 27살 찬웅
        PersonWithBuilder person2 = new PersonWithBuilder.Builder("찬웅", 27).address("서울 강남").build();
        System.out.println(person2.toString());
    }
}
