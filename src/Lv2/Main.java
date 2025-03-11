package Lv2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // List 선언 및 초기화
        List<MenuItem> menuItems = new ArrayList<>();

        // add 함수를 통해 new MenuItem(이름, 가격, 설명) List 에 삽입
        MenuItem menuItem1 = new MenuItem("1. ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        MenuItem menuItem2 = new MenuItem("2. SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        MenuItem menuItem3 = new MenuItem("3. Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        MenuItem menuItem4 = new MenuItem("4. Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거");

        menuItems.add(menuItem1);
        menuItems.add(menuItem2);
        menuItems.add(menuItem3);
        menuItems.add(menuItem4);

        // Scanner 선언
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("[ SHAKESHACK MENU ]");
            // 반복문을 활용해 List 안에 있는 MenuItem을 하나씩 출력
            for (MenuItem item : menuItems) {
                System.out.println(item.getName() + " | W " + item.getPrice() + " | " + item.getDescription());
            }
            System.out.println("0. 종료      | 종료");
            System.out.println("메뉴를 선택해 주세요");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("다시 입력해 주세요");
            }
        } while (choice != 0);
    }
}