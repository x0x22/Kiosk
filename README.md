## 프로젝트 소개
스파르타 Spring 6기 키오스크 과제


## 개발기간
25.03.10 ~ 25.03.14

## 개발환경
- Java 17
- JDK 17

## 기능

### 반복문을 활용해 MenuItem을 하나씩 출력

    System.out.println("[ SHAKESHACK MENU ]");
    
    for (int num = 0; num < menuItems.size(); num++) {
    MenuItem item = menuItems.get(num);
    System.out.println((num + 1) + ". " + item.getName() + " | W " + item.getPrice() + " | " + item.getDescription());
    }
    System.out.println("0. 종료      | 종료");
    System.out.println("메뉴를 선택해 주세요");
    
### 메뉴판 출력시
    [ SHAKESHACK MENU ]
    1. ShackBurger | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거
    2. SmokeShack | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거
    3. Cheeseburger | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거
    4. Hamburger | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거
    0. 종료      | 종료
    메뉴를 선택해 주세요

### 메서드로 숫자가 아닌 값이 들어올 시 재입력을 받음

    private int getUserSelect() {    
        while (true) {
            if (!sc.hasNextInt()) {
                System.out.println("잘못된 입력입니다. 숫자를 입력하세요.");
                sc.nextLine();
                continue;
            }
            int num = sc.nextInt();
            sc.nextLine();
            return num;
        }

### boolean으로 메뉴 선택 확인

    private boolean selectCheck(MenuItem item) {
        while (true) {
            System.out.println(item.getName() + " | W " + item.getPrice() + " | " + item.getDescription());
            System.out.println("주문하시겠습니까? (Y/N)");
            String check = sc.next();
            sc.nextLine();

            if (check.equals("Y")) {
                return true;
            } else if(check.equals("N")) {
                return false;
            } else {
                System.out.println("Y 또는 N 을 입력해주세요");
            }
