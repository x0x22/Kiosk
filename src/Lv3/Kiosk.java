package Lv3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {

    // List를 선언하여 여러 MenuItem을 추가
    private List<MenuItem> menuItems = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    //List<MenuItem> menuItems 는 Kiosk 클래스 생성자를 통해 값을 할당
    public Kiosk() {
        // add 함수를 통해 new MenuItem(이름, 가격, 설명) List 에 삽입
        MenuItem menuItem1 = new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        MenuItem menuItem2 = new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        MenuItem menuItem3 = new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        MenuItem menuItem4 = new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거");

        menuItems.add(menuItem1);
        menuItems.add(menuItem2);
        menuItems.add(menuItem3);
        menuItems.add(menuItem4);
    }

    // 기능 main 함수에서 관리하던 입력과 반복문 로직은 이제 start 함수를 만들어 관리
    public void start() {
        while (true) {

            System.out.println("[ SHAKESHACK MENU ]");

            // 반복문을 활용해 List 안에 있는 MenuItem을 하나씩 출력
            for (int num = 0; num < menuItems.size(); num++) {
                MenuItem item = menuItems.get(num);
                System.out.println((num + 1) + ". " + item.getName() + " | W " + item.getPrice() + " | " + item.getDescription());
            }
            System.out.println("0. 종료      | 종료");
            System.out.println("메뉴를 선택해 주세요");

            // 선언과 초기화
            int select = getUserSelect();

            // 예외처리
            if (select == 0) {
                System.out.println("키오스크를 종료합니다.");
                break;
            } else if (select > 0 && select <= menuItems.size()) {
                MenuItem selected = menuItems.get(select - 1);
                System.out.println(selected.getName() + " | W " + selected.getPrice() + " | " + selected.getDescription());
            } else {
                System.out.println("번호를 확인해주세요.");
            }
        }
    }

    private int getUserSelect() {
        while (true) {
            if (!sc.hasNextInt()) {
                System.out.println("잘못된 입력입니다. 숫자를 입력하세요.");
                sc.nextLine();
                System.out.println("다시 입력해주세요");
                continue;
            }
            int num = sc.nextInt();
            sc.nextLine();
            return num;
        }
    }
}
