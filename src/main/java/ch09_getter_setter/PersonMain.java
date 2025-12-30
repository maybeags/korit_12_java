package ch09_getter_setter;

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person();
        // field에 값을 직접 대입하는 방법
        person1.name = "김일";
        person1.age = -10;
        person1.address = "부산광역시 부산진구";

        // field를 직접 조회하는 방법
        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println(person1.address);

        // setter를 경유하여 field에 값을 대입하는 방법
        // setter는 method이므로 객체명.메서드명();
        person1.setName("김일일");
        person1.setAge(-100);
        person1.setAddress("서울특별시 종로구");

        // getter를 적용하여 field를 조회하는 방법
        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        System.out.println(person1.getAddress());

        // 여기서 getter만을 사용하여
        // 김일일 학생의 나이는 0 살이고 주소는 서울특별시 종로구입니다. 라고 출력하도록 작성하시오.

    }
}
