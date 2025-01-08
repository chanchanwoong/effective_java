package chapter02;

public class CarWithFactoryMethod {

    private String brand;
    private String color;
    private String factory;

    // private 생성자
    protected CarWithFactoryMethod(String brand, String color, String factory) {
        this.brand = brand;
        this.color = color;
        this.factory = factory;
    }

    // 정적 팩토리 메서드
    public static CarWithFactoryMethod from(String brand) {
        return new CarWithFactoryMethod(brand, "black", "busan");
    }

    public static CarWithFactoryMethod ofBrandAndColor(String brand, String color) {
        return new CarWithFactoryMethod(brand, color, "busan");
    }

    public static CarWithFactoryMethod withFullDetails(String brand, String color, String factory) {
        return new CarWithFactoryMethod(brand, color, factory);
    }

    public static void main(String[] args) {
        // 부산에서 만들어진 검정색 테슬라 자동차
        CarWithFactoryMethod teslaCar = CarWithFactoryMethod.from("Tesla");

        // 부산에서 만들어진 빨간색 BNW 자동차
        CarWithFactoryMethod bmwCar = CarWithFactoryMethod.ofBrandAndColor("BMW", "RED");

        // 로마에서 만들어진 검정색 르노 자동차
        CarWithFactoryMethod RenaultCar = CarWithFactoryMethod.withFullDetails("Renault", "black", "roma");
    }
}

/*
    정적팩토리메서드 기법을 이용해 기존의 생성자보다 훨 직관적으로 변경되었다.
 */