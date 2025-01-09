package chapter02.item03;

public class Elvis {

    private int data = 0;

    public static final Elvis INSTANCE = new Elvis();

    private Elvis() {}

    public void PlusData() {
        data++;
    }
    public int getData() {
        return data;
    }
}

class SingletonTest {

    public static void main(String[] args) {
        // 싱글턴 객체 생성 시도 불가능
//        Elvis elvis = new Elvis();

        Elvis elvis1 = Elvis.INSTANCE;
        Elvis elvis2 = Elvis.INSTANCE;

        System.out.println("elvis1의 초기값 > " + elvis1.getData());
        System.out.println("elvis2의 초기값 > " + elvis2.getData());

        elvis1.PlusData();
        System.out.println("elvis1 만 데이터 증감 후 elvis1의 data > " + elvis1.getData());
        System.out.println("elvis1 만 데이터 증감 후 elvis2의 data > " + elvis2.getData());

        System.out.println("elvis1 == elvis2 의 결과 > " + (elvis1 == elvis2));
    }
}