package ch06_loops;

import java.util.Scanner;

/*
    중첩 for문도 가능합니다.
    for ( int i = 0 ; i < 100 ; i++ ) {
        반복실행문1-a
        for ( int j = 0 ; j < 100 ; j++ ) {
            반복실행문2
        }
        반복실행문1-b
    }
    for 문을 활용하여 1일차 1교시입니다. ~ 5일차 3교시입니다. 까지 출력하시오.
    다 하면 구구단 for문으로 출력하시오.
 */
public class Loop06NestedFor {
    public static void main(String[] args) {
//        for ( int i = 1 ; i < 6 ; i++ ) {
//            for ( int j = 1 ; j < 4 ; j++ ) {
//                System.out.println(i + "일차 " + j + "교시입니다.");
//            }
//            System.out.println();   // 반복실행문1-b
//        }

        for ( int i = 2 ; i < 10 ; i++ ) {
            for ( int j = 1 ; j < 10 ; j++ ) {
                System.out.println(i + " x " + j + " = " + (i*j));
            }
            System.out.println();   // 반복실행문1-b
        }

        /*
            1 2 3 4 5 ... 10
            11 ... 20
            91 ... 100
         */
        // 풀이법 # 1 : 100 번 반복하는 방법
//        for ( int i = 1 ; i < 101 ; i++ ) {
//            System.out.print(i + " ");      // 반복실행문1-a
//            if(i % 10 == 0) {               // 중첩 for문 응용
//                System.out.println();
//            }
//        }
//
//        // 풀이법 # 2 : 10 번 반복
//        for ( int j = 1 ; j < 101 ; j+=10 ) {
//            System.out.println(j + " " + (j+1) + " " + (j+2) + " " + (j+3) + " " + (j+4) + " " + (j+5) + " " + (j+6) + " " + (j+7) + " " + (j+8) + " " + (j+9));
//        }

        /*
            숫자를 입력 받아서 1부터 홀수만 더하는 for 반복문을 작성하시오.
            다 했으면 1부터 짝수만 구하는 for 반복문을 작성하시오.

            실행 예
            1부터 몇 까지 더하시겠습니까? >>> 10
            1부터 10까지 중 홀수의 합은 25 입니다.
            1부터 10까지 중 짝수의 합은 30 입니다.
         */
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("1부터 몇 까지 더하시겠습니까? >>> ");
//        int n = scanner.nextInt();
//        int sumEven = 0; // 짝수의 합을 저장할 변수
//        int sumOdd = 0; // 홀수의 합을 저장할 변수
//        int sum = 0;
//        for ( int i = 1 ; i < (n+1) ; i++ ) {
//            sum +=i;
//            if (i % 2 == 0) {
//                sumEven += i;
//            } else {
//                sumOdd += i;
//            }
//        }
//        System.out.println("1부터 " + n + "까지 중 홀수의 합은 " + sumOdd + "입니다.");
//        System.out.println("1부터 " + n + "까지 중 짝수의 합은 " + sumEven + "입니다.");
//        System.out.println(sum);
    }
}
