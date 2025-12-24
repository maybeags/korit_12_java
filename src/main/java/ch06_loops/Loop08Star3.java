package ch06_loops;
/*
            *
           **
          ***
         ****
        *****

       *****
        ****
         ***
          **
           *
 */
public class Loop08Star3 {
    public static void main(String[] args) {
        // 개행을 책임지는 for-i문
        for ( int i = 0 ; i < 6 ; i++ ) {
            // 공백을 책임지는 for-j문 : 공백은 줄어들어야 함.
            for ( int j = 5 ; j > i ; j-- ) {
                System.out.print(" ");
            }
            // 별을 책임지는 for-k문 : 별 개수는 늘어나야 함.
            for ( int k = 0 ; k < i ; k++ ) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 개행을 책임지는 for-i문
        for ( int i = 0 ; i < 6 ; i++ ) {
            // 공백을 책임지는 for-j문 : 공백은 늘어나야 함.
            for ( int k = 0 ; k < i ; k++ ) {
                System.out.print(" ");
            }
            // 별을 책임지는 for-k문 : 별 개수는 줄어들어야 함.
            for ( int j = 5 ; j > i ; j-- ) {
                System.out.print("*");
            }
            System.out.println();
        }

        // ch07_methods 패키지 생성 -> Method01 -> main을 만들지 않습니다.
    }
}
