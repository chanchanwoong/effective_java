package chapter04.item19;

import java.time.LocalDate;

/*
    Human 클래스를 final로 명시했으며, 필드 값은 default에 setter를 public으로 만들었다.
    final 클래스의 객체는 내부 필드 값이 변경될 것 인가?
 */

public final class Human {

    String name;
    LocalDate birth;

    // 생성자
    Human(String name, LocalDate birth) {
        this.name = name;
        this.birth = birth;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }
    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    // getter
    public String getName() {
        return this.name;
    }
    public LocalDate getBirth() {
        return this.birth;
    }
}
