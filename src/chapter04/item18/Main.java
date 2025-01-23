package chapter04.item18;

/*
    합성(Composition)
    - 합성은 수평적인 관계의 클래스들을 합친는 것을 의미한다.
    - 상속이 필요해보이는 관계면 is-a 관계가 맞는 지 확인해야 한다.
    -- "자동차"와 "엔진"은 서로의 기능이 필요하나, is-a 관계가 아니다.
    -- 수평적인 관계인 has-a 관계가 된다.

    상속의 문제점
    - 상속을 사용하면 상위 클래스의 기능을 그대로 가져오는 대신에 결합도가 높아진다.
    - 상위 클래스와 하위 클래스의 관계가 컴파일 시점에 결정이 되어 실행 중간에는 변경할 수 없다.
    - 자식 클래스에서는 적합하지 않은 메서드가 상속될 수 있다.
    -- 이를 위해서 자식 클래스에서 안 쓰는 메서드를 효과 없는 메서드로 오버라이딩 할 수 있지만 유지보수성이 낮아진다.

    합성을 해야 하는 이유
    - 객체 내부를 공개하지 않고 인터페이스를 통해 코드를 재사용하기에, 결합도를 낮출 수 있다.

 */

public class Main {

    public static void main(String[] args) {
        Car digelCar = new Car(new Engine("디젤"));
        digelCar.drive();
        digelCar.breaks();

        Car electroCar = new Car(new Engine("전기"));
        electroCar.drive();
        electroCar.breaks();
    }
}
