import java.util.*;


public class Q3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShapeFactory factory = new ShapeFactory();
        System.out.print("Enter shape: ");
        String s = sc.nextLine();
        Shape fig = factory.create(s);
        if(fig != null) fig.draw();
    }
}

interface Shape{
    public void draw();
}

class Circle implements Shape{
    @Override
    public void draw(){
        System.out.println("Drawing a circle");
    }
}

class Rectangle implements Shape{
    @Override
    public void draw(){
        System.out.println("Drawing a rectangle");
    }
}

class Triangle implements Shape{
    @Override
    public void draw(){
        System.out.println("Drawing a triangle");
    }
}

interface Factory{
    public Shape create(String s);
}

class ShapeFactory implements Factory {
    @Override
    public Shape create(String s){
        if(s == null) return null;
        return switch (s.toLowerCase()) {
            case "circle" -> new Circle();
            case "rectangle" -> new Rectangle();
            case "triangle" -> new Triangle();
            default -> null;
        };
    }
}
