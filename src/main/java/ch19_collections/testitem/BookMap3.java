package ch19_collections.testitem;

import java.util.*;

public class BookMap3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> bookInventory = new HashMap<>();
        bookInventory.put("Java프로그래밍 입문", 2);
        boolean endOfProgram = false;
        String bookTitle = "";
        while(!endOfProgram) {
            System.out.println("--- 도서 재고 관리 프로그램 ---");
            System.out.println("1. 도서추가\n2. 재고 수정\n3. 재고 목록\n4. 종료");
            System.out.print("메뉴를 선택하세요 >>> ");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1 :
                    System.out.print("새 도서명을 입력하세요 >>> ");
                    bookTitle = scanner.nextLine();
                    if(bookInventory.containsKey(bookTitle)) {
                        System.out.println("이미 재고에 있는 도서입니다.");
                    } else {
                        System.out.print("재고 수량을 입력하세요 >>> ");
                        int stock = scanner.nextInt();
                        scanner.nextLine();
                        bookInventory.put(bookTitle, stock);
                        System.out.println(bookTitle + " 도서가 " + stock + " 권 추가되었습니다.");
                    }
                    break;
                case 2 :
                    System.out.print("수량을 추가할 도서명을 입력하세요 >>> ");
                    bookTitle = scanner.nextLine();
                    if(bookInventory.containsKey(bookTitle)) {
                        System.out.print("재고 추가분을 입력하세요 >>> ");
                        int temp = scanner.nextInt();
                        int stock = bookInventory.get(bookTitle) + temp;
                        System.out.println(bookTitle + " 도서가 " + temp + " 권 추가하여 " + stock + " 권이 있습니다.");
                        bookInventory.put(bookTitle, stock);
                    } else {
                        System.out.println("해당 도서가 재고에 없습니다.");
                    }
                    break;
                case 3 :
                    System.out.print("출고 할 도서명을 입력하세요 >>> ");
                    bookTitle = scanner.nextLine();
                    if(bookInventory.containsKey(bookTitle)) {
                        System.out.print("출고분을 입력하세요 >>> ");
                        int temp = scanner.nextInt();
                        if( bookInventory.get(bookTitle) - temp < 0 ) {
                            System.out.println("재고가 부족합니다.");
                        } else {
                            int stock = bookInventory.get(bookTitle) - temp;
                            System.out.println(bookTitle + " 도서가 " + temp + " 권 출고하여 " + stock + " 권이 있습니다.");
                            bookInventory.put(bookTitle, stock);
                        }
                    } else {
                        System.out.println("해당 도서가 재고에 없습니다.");
                    }
                    break;
                case 4 :
                    Set<String> bookTitleSet = bookInventory.keySet();
                    List<String> bookTitles = new ArrayList<>();
                    bookTitles.addAll(bookTitleSet);
                    for ( String book : bookTitles ) {
                        System.out.println("도서명 : " + book + ", 현재 재고 : " + bookInventory.get(book));
                    }
                    break;
                case 5 :
                    System.out.println("프로그램을 종료합니다.");
                    endOfProgram = true;
                    break;
                default :
                    System.out.println("잘못된 선택입니다.");
            }
        }
    }
}


/*
    ch20_json / JSON1
 */