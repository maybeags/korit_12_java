package ch14_casting.game.system;

import ch14_casting.game.items.*;       // * 의 발음은 애스터리스크(asterisk라고 하고, all의 의미를 가집니다)
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Inventory {
    private Weapon[] weaponSlots;

    // 다른 방식으로 정의하는 생성자 하나만 추가해두겠습니다.
    public Inventory(int capacity) {
        this.weaponSlots = new Weapon[capacity];
    }

    public void addWeapon(Weapon weapon) {
        for ( int i = 0 ; i < weaponSlots.length ; i++ ) {
            if(weaponSlots[i] == null) {
                weaponSlots[i] = weapon;
                System.out.println("아이템이 슬롯 [ " + (i+1) + " ] 에 추가되었습니다.");
                return;
            }
        }
        System.out.println("인벤토리가 가득 차서 무기를 더 이상 주울 수 없습니다.");
    }

    public void attackAll() {
        System.out.println("업캐스팅을 활용한 공통 method 호출");
        for (Weapon weapon : weaponSlots) {
            if (weapon != null) {
                weapon.attack();
                continue;
            }
            System.out.println("무기를 장착하고 있지않습니다.");
        }
    }

    public void useSpecificAbilities() {
        System.out.println("다운캐스팅을 응용한 각 객체의 고유 method 호출");
        for (Weapon weapon : weaponSlots) {
            if (weapon == null) {
                System.out.println("무기를 장착하고 있지 않아 스킬을 쓸 수 없습니다.");
                continue;
            }
            if(weapon instanceof Sword) {
                // 다운 캐스팅
                Sword sword = (Sword) weapon;
                sword.parry();
            } else if (weapon instanceof Bow) {
                Bow bow = (Bow) weapon;
                bow.snipe();
            } else if (weapon instanceof Staff) {
                Staff staff = (Staff) weapon;
                staff.castSpell();
            } else {     // Staff가 마지막 무기인데 else에 안 넣은 이유는 나중에 단검(Dagger) 등을 추가할 때를 대비하여
                System.out.println("알 수 없는 무기입니다.");
            }
        }
    }
}










