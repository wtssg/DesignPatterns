package creationalpatterns.prototype;

public class Circle extends Shape {
    public Circle() {
         this.setType("Circle");
    }
    @Override
    public void draw() {
        System.out.println("This is a Circle!!!");
    }
}