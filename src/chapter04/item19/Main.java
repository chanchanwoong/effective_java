package chapter04.item19;

import java.time.LocalDate;

/*
    final 클래스의 객체는 내부의 상태가 변경이 가능하다.
    단지 상속만 불가능하게 한다.
 */

public class Main {

    public static void main(String[] args) {
        Human human = new Human("찬웅", LocalDate.of(1999, 10, 13));

        System.out.println(human.getName() + "의 생일은 " + human.getBirth() + " 입니다.");

        // final 클래스 객체 내부 값을 변경
        human.setName("찬웅이 아님");
        human.setBirth(LocalDate.of(1900, 01, 01));

        System.out.println(human.getName() + "의 생일은 " + human.getBirth() + " 입니다.");
    }
}
