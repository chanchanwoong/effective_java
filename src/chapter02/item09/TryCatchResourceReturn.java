package chapter02.item09;

import java.io.*;

/*
    resource 처리
    - 외부 데이터 처리를 위해 생성한 객체들은 사용하고 나면 반환해줘야 한다.
    -- 메모리 누수 방지, 시스템 자원 관리, 성능 문제, 파일 손상 방지 등의 이유로 외부 자원을 반환해야 한다.
    -- ex) 입출력 스트림(BufferedReader, BufferedWriter 등), 네트워크 소켓(Socket), DB연결(Connection) 등

    - 기존에는 자원 반환을 try {자원 사용} catch {자원 반환) 방식으로 진행했지만, 자원 반환을 하는 과정에서도 예외 가능성이 있다.
    -- 그렇기 때문에, close() 메서드도 try-catch 문에 넣어줘야했다.
    -- 이 방식은 코드 가독성이 매우 떨어진다.

 */

public class TryCatchResourceReturn {

    public static void main(String[] args) {
        FileWriter file = null;

        try {
            file = new FileWriter("data.txt");
            file.write("리소스 회수를 어떻게 해야할까?");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            // 자원회수
//            file.close();   // 이렇게만 두면 close() 메서드에서 에러가 나면 자원 회수가 안된다.

            // close() 예외 처리를 위해 try-catch를 진행해준다.
            try {
                file.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            // 코드 가독성이 떨어진다.
            // 회수를 위해서 다시 try-catch 구성을 써야 한다.
        }
    }
}
