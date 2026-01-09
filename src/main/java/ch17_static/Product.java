package ch17_static;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Product {
    // field 선언
    private String name;
    private int instanceCnt = 0;
    // 정적 변수 선언
    private static int cnt = 0;
    @Getter
    private static String title = "제품입니다.";

    public Product() {
        System.out.println("Product 클래스의 객체가 생성되었습니다.");
        instanceCnt++;
        cnt++;
    }
}
