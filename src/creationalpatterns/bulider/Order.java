package creationalpatterns.bulider;

import java.util.ArrayList;
import java.util.List;

public class Order {
    List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void showCost() {
        float cost = 0.0f;
        for (Item i : items) {
            cost += i.price();
        }
        System.out.println("cost : " + cost);
    }

    public void showItems() {
        for (Item item : items) {
            System.out.println( "item ：" + item.name() + "  price : " + item.price());
        }
    }
}
