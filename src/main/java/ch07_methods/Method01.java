package ch07_methods;

import java.util.Scanner;

public class Method01 {
// method 정의 영역
    // 1. [ x | x ] [ 입력값 / 출력값 ]
    public static void call1() {
        System.out.println("[ x | x ]");
    }

    // 2. [ o | x ]
    public static void call2(String example) {  // 그럼 여기서 String example은 매개변수라고 합니다.
        System.out.println("[ o | x ]");
        System.out.println("오늘 기분은 : " + example);
        System.out.println();
    }

    // 3. [ x | o ]
    public static String call3() {
        String example = "안녕하세요";
        int example2=123;
        System.out.println("[ x | o ]");
        return example;
    }

    // 4. [ o | o ]
    public static double call4(double score) {
        System.out.println("[ o | o ]");
        System.out.println("해당 과목은 3학점 짜리입니다.");
        return score * 3;
    }

    public static void main(String[] args) {
        // method 호출 영역
        call1();                // 얘는 argument가 없는거네요.
        call2("잠오고 피곤하고 공부가 하기 싫은데 굳이 선택하라고 하면 자습이 하고 싶다");
        // 위의 메서드는 argument가 있는데, 그 argument의 자료형으로 String을 요구합니다.
        String feeling = "tired and sick";
        call2(feeling);
        call3();
        System.out.println(call3() + " ! 🦑");    // return이라는 것은 콘솔에 출력하라는 의미가
        // 절대절대 아니고 특정 데이터가 뽑혀져 나온다는 겁니다. 그것을 변수에 저장한 다음에
        // 개발자들은 개발자 입맛대로 편집해서 새로운 결과값을 만들어내는 역할을 합니다.

        call4(4.5);
        System.out.println(call4(4.5));


        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자 입력하세요 >>> ");
        int num = scanner.nextInt();
        System.out.println(num);

    }
}
