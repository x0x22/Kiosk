package Lv2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // List를 선언하여 여러 MenuItem을 추가
        List<MenuItem> menuItems = new ArrayList<>();

        // add 함수를 통해 new MenuItem(이름, 가격, 설명) List 에 삽입
        MenuItem menuItem1 = new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        MenuItem menuItem2 = new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        MenuItem menuItem3 = new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        MenuItem menuItem4 = new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거");

        menuItems.add(menuItem1);
        menuItems.add(menuItem2);
        menuItems.add(menuItem3);
        menuItems.add(menuItem4);

        // Scanner 선언
        Scanner sc = new Scanner(System.in);
        int select;

        do {
            System.out.println("[ SHAKESHACK MENU ]");
            // 반복문을 활용해 List 안에 있는 MenuItem을 하나씩 출력
            for (int num = 0; num < menuItems.size(); num++) {
                MenuItem item = menuItems.get(num);
                System.out.println((num + 1) + ". " + item.getName() + " | W " + item.getPrice() + " | " + item.getDescription());
            }
            System.out.println("0. 종료      | 종료");
            System.out.println("메뉴를 선택해 주세요");

            select = sc.nextInt();
            sc.nextLine();
            
            // 예외처리
            if (select >= 1 && select <= menuItems.size()) {
                MenuItem selectedMenu = menuItems.get(select - 1);
                System.out.println("[선택한 메뉴를 확인해주세요]");
                selectedMenu.display();
            } else if( select != 0) {
                System.out.println("다시 선택해주세요");
            }
        } while (select != 0);
    }
}