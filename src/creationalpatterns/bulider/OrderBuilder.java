package creationalpatterns.bulider;

public class OrderBuilder {

    /**
     * 第一种键鼠组合订单：Hp键盘 + Hp鼠标
     * @return
     */
    public Order HpOrder() {
        Order order = new Order();
        Item mouse = new HpMouse();
        Item keyboard = new HpKeyboard();
        order.addItem(mouse);
        order.addItem(keyboard);
        return order;
    }

    /**
     * 第二种键鼠组合订单：Dell键盘 + Dell鼠标
     * @return
     */
    public Order DellOrder() {
        Order order = new Order();
        Item mouse = new DellMouse();
        Item keyboard = new DellKeyboard();
        order.addItem(mouse);
        order.addItem(keyboard);
        return order;
    }

    /**
     * 第三种键鼠组合订单：Dell键盘 + Hp鼠标
     * @return
     */
    public Order MixOrder() {
        Order order = new Order();
        Item mouse = new HpMouse();
        Item keyboard = new DellKeyboard();
        order.addItem(mouse);
        order.addItem(keyboard);
        return order;
    }

}
