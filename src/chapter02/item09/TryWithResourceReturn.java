package chapter02.item09;

import java.io.*;

/*
    try-with-resource을 통한 자원 반환
    - 기존에 자원반환을 위한 try-catch 가독성 문제를 해결한 문법
    - 가독성 측면에서 개선되었다.

    - try () 내부에 객체 생성을 하면 따로 close()를 하지 않아도 try 벗어나는 순간 close()가 호출된다.
 */

public class TryWithResourceReturn {

    public static void main(String[] args) {

        try (
                FileWriter file = new FileWriter("data.txt");
                ) {
            file.write("try-with-resource 문법으로 리소스 회수하자.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // catch 부분이 훨 깔끔해졌다.
    }
}
