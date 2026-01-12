package ch14_casting.game;

import ch14_casting.game.items.*;
import ch14_casting.game.system.Inventory;

public class GameMain {
    public static void main(String[] args) {
        // AllArgsConstructor를 활용한 Inventory 객체 생성
        Inventory inventory1 = new Inventory(new Weapon[5]);
        // 추가로 생성한 생성자를 활용한 Inventory 객체 생성
        Inventory myInventory = new Inventory(5);

        // 저희가 지난번에는 main에서 객체 만들고 그 다음에 중앙 통제에 넣었습니다.
        // 이번에는 인벤토리의 addWeapon()의 argument로 바로 생성자 호출했습니다.
        myInventory.addWeapon(new Sword());
        myInventory.addWeapon(new Bow());
        myInventory.addWeapon(new Staff());

        myInventory.attackAll();
        System.out.println();
        myInventory.useSpecificAbilities();

    }
}
