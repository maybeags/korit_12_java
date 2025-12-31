package ch10_access_modifier;
/*
    목표 : 객체 지향 설계 및 접근 제어자 이해를 바탕으로
    다양한 접근 수준의 필드와 메서드를 갖는 캐릭터 클래스를 정의,
    이를 CharacterMain 클래스에서 기능 테스트를 수행 할겁니다.

    Character 클래스 설계
    1. field
        name - 캐릭터 이름 / 공개 가능
        health - 체력 / 읽기만 허용
        power - 공격력 / 같은 패키지만
        skill - 스킬명 / 자식 클래스만
        exp - 경험치 / 외부에서 완전 차단

        Character 클래스의 인스턴스인 warrior를 생성
        이름 : 전사
        체력 : 100
        공격력 200
        스킬 : 세로 베기
        exp 30
        으로 기본 생성자를 통해 생성하고, setter를 통하여 데이터를 설정하시오.
    2. method
        getHealth()
        attack() : 공격 시 콘솔 창에                       call1()유형
            name 이(가) power로 공격 !
            name 이(가) 경험치 amount을(를) 얻었습니다. -> 라고 두 줄 출력되게.
        heal() : 체력을 10 회복하고, 현재 체력 출력
            체력이 10 회복되었습니다. 현재 체력 : health(숫자로 출력될 수 있게)
        getExp(int amount) -> call2() 유형인데 경험치를 증가시키는 메서드(내부 전용)
            실행 예
            name이(가) 경험치 amount을(를) 얻었습니다. 라고 출력되게.
 */
class Character {

}

public class CharacterMain {
    public static void main(String[] args) {

    }
}
