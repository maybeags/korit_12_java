package ch21_exception.signup;

public class InvalidIdException extends Exception{
    public InvalidIdException(String message) {
        super(message);
        System.out.println("일부러 조금 다르게 쓰는 생성자 호출시 안내문 : " + this.getClass().getSimpleName());
    }
}
