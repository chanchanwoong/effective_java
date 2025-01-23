package chapter04.item18;

public class Car {

    private Engine engine;

    Car(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        System.out.printf("%s엔진으로 드라이브\n", engine.getEngineType());
    }

    public void breaks() {
        System.out.printf("%s엔진으로 브레이크\n", engine.getEngineType());
    }
}
