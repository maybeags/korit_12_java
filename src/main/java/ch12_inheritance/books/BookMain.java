package ch12_inheritance.books;
/*
    BookMain에서
    Book 클래스의 인스턴스 생성
    Getter를 활용하여
    실행 예
    이 책의 제목은 자바의 정석입니다.
    이 책의 저자는 남궁성입니다.
    book1.showInfo()를 호출하여
    제목 : 자바의 정석
    저자 : 남궁성
 */
public class BookMain {
    public static void main(String[] args) {
//        Book book1 = new Book();  // 이제는 이렇게 생성하는 게 불가능 -> AllArgsConstructor만 정의해서.
        String title = "자바의 정석";
        Book book1 = new Book(title, "남궁성");
        System.out.println("이 책의 제목은 " + book1.getTitle() + "입니다.");
        System.out.println("이 책의 저자는 " + book1.getAuthor() + "입니다.");
        book1.showInfo();
/*
    EBook 클래스의 인스턴스 생성
    스프링 입문 / 이강준 / 5.2 / EPUB 으로 생성할 것.
    그 다음 setter 활용하여 파일 형식을 PDF로 변환
    그리고 getter를 활용하여
    이 전자책의 포맷은 PDF입니다. 를 출력하시오.

    eBook1.showInfo();를 실행하여
    제목 : 스프링 입문
    저자 : 이강준
    파일 크기 : 5.2 MB
    파일 형식 : PDF
    를 출력하시오.
 */
        EBook eBook1 = new EBook("스프링 입문", "이강준", 5.2, "EPUB");
        eBook1.setFormat("PDF");        // 자식 클래스의 고유 메서드에 해당하겠네요.
        System.out.println("이 전자책의 포맷은 " + eBook1.getFormat() + "입니다.");
        // 재정의된 메서드 호출
        eBook1.showInfo();
    }
}
/*
    ch13_abstraction -> 패키지 abstract_classes 생성
    -> Factory / FactoryMain / PhoneFactory / TabletFactory 클래스를 생성하시오.
 */