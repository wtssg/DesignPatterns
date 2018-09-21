package creationalpatterns.prototype;

public class Square extends Shape {

    public  Square() {
        this.setType("Square");
    }
    @Override
    public void draw() {
        System.out.println("this is a square!!!");
    }
}
