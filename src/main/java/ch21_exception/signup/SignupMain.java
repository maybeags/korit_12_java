package ch21_exception.signup;

import java.util.Scanner;

public class SignupMain {
    public static void checkId(String id) throws InvalidIdException {
        if(id.length() < 8) {
            throw new InvalidIdException("id는 8자 이상이어야 합니다. 현재 : " + id.length());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("생성할 ID 입력 >>> ");
            String userId = scanner.nextLine().replace(" ", "");
            checkId(userId);
            System.out.println("아이디 생성 성공 : " + userId);
        } catch (InvalidIdException e) {
            System.out.println("오류 : " + e.getMessage());
        } finally {
            System.out.println("프로그램 종료");
        }
    }
}
