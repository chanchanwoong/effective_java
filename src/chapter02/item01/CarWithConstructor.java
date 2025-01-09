package chapter02.item01;

public class CarWithConstructor {

    private String brand;
    private String color = "black";
    private String factory = "busan";

    // 오버로딩 생성자
    public CarWithConstructor(String brand, String color, String factory) {
        this.brand = brand;
        this.color = color;
        this.factory = factory;
    }

    public CarWithConstructor(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public CarWithConstructor(String brand) {
        this.brand = brand;
    }

    public static void main(String[] args) {
        // 부산에서 만들어진 검정색 테슬라 자동차
        CarWithConstructor teslaCar = new CarWithConstructor("Tesla");

        // 부산에서 만들어진 빨간색 기아 자동차
        CarWithConstructor kiaCar = new CarWithConstructor("Kia", "Red");

        // 로마에서 만들어진 검정색 르노 자동차
        CarWithConstructor RenaultCar = new CarWithConstructor("Renault", "black", "roma");
    }
}

/*
    위처럼 오버로딩된 생성자로 개발하면 협업하는 개발자는 객체를 만들 때, 매개변수와 순서를 확인하기가 어렵다.
 */