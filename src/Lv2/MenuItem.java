package Lv2;

import java.util.ArrayList;
import java.util.List;

public class MenuItem {

    // 속성
    private String name;
    private double price;
    private String description;

    //생성자
    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
    //기능

    public void display() {
        System.out.println(name + price);
        System.out.println(description);
    }


}
