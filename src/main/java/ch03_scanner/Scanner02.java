package ch03_scanner;

import java.util.Scanner;

/*
    1. 다음과 같이 콘솔에 출력될 수 있도록 코드를 작성하시오.
    나이를 입력하세요 >>> 19
    저는 올해 19살입니다.
    내년에는 20살이 됩니다.
 */
public class Scanner02 {
    public static void main(String[] args) {
        // 콘솔에 데이터를 입력하기 위해 Scanner import
        Scanner scanner = new Scanner(System.in);
        System.out.print("나이를 입력하세요 >>> ");
        int age = scanner.nextInt();
        System.out.println("저는 올해 " + age + "살입니다.");
        System.out.println("내년에는 " + (age + 1) + "살이 됩니다.");
    }
}
