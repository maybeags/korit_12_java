package ch17_static;

public class ProductMain {
    public static void main(String[] args) {
        System.out.println(Product.getTitle());
        // 객체 생성을 하지 않았지만 title 정적변수를
        // 불러올 수 있습니다.
        // 롬복 사용시 : 클래스 레벨에 @Getter가 있더라도
        // 정적 변수 레벨에 추가적으로 @Getter를
        // 적용해야만 합니다.
    }
}
