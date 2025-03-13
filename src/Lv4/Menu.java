package Lv4;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private String category;
    private List<MenuItem> menuItems;

    // 생성자로 카테고리를 만들고 메뉴 아이템 리스트를 생성함.
    public Menu(String category) {
        this.category = category;
        this.menuItems = new ArrayList<>();
    }

    // 메뉴 아이템 추가
    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
    }

    // 메뉴 아이템 리스트 게터
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    // 카테고리 이름 게터
    public String getCategory() {
        return category;
    }
}
