package Lv4;

//MenuItem 클래스 생성하기
public class MenuItem {

    // 클래스는 이름, 가격, 설명 필드를 갖습니다.
    private String name;
    private double price;
    private String description;

    //생성자
    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    // 게터
    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

}
