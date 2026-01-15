package ch21_exception.conveni;

import java.util.InputMismatchException;
import java.util.Scanner;

class InvalidOrderQuantityException extends Exception {
    public InvalidOrderQuantityException(String message) {
        super(message);
    }
}


public class OrderMain {
    public static void order(int quantity) throws InvalidOrderQuantityException {
        if (quantity < 1 || quantity > 50) throw new InvalidOrderQuantityException("주문 가능 수량은 1 ~ 50 개 사이입니다.");
        System.out.println("상품 " + quantity + " 개 주문 접수가 완료되었습니다." );
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("주문 수량을 입력하세요 >>> ");
            int quantity = scanner.nextInt();
            order(quantity);
        } catch (InvalidOrderQuantityException e) {
            System.out.println("주문 불가 : " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("정수만 입력할 수 있습니다.");
        } catch (Exception e) {
            System.out.println("알 수 없는 예외가 발생하였습니다.");
        } finally {
            System.out.println("프로그램이 정상 종료되었습니다.(주문 실패를 했더라도)");
        }
    }


}
