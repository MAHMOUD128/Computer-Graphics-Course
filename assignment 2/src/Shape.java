/**
 * abstract class Shape => You can't take an object from it.
 * abstract public void draw() => You can't implement it, but you can override it when you inherit from it.
 * public void erase() => You can implement it, but you can  override it when you inherit from it.
 * */
abstract public class Shape
{
    abstract public void draw();
    public void erase()
    {

    }

}
class Circle extends Shape
{

        @Override
        public void draw()
        {
            System.out.println("Drawing a circle");
        }
        @Override
        public void erase()
        {
            System.out.println("Erasing a circle");
        }

}

class Triangle extends Shape
{

        @Override
        public void draw()
        {
            System.out.println("Drawing a triangle");
        }
        @Override
        public void erase()
        {
            System.out.println("Erasing a triangle");
        }

}

class Square extends Shape
{

        @Override
        public void draw()
        {
            System.out.println("Drawing a square");
        }
        @Override
        public void erase()
        {
            System.out.println("Erasing a square");
        }
}

/**
 * Main_Shape - the main class
 */

class Main_Shape {
    public static void main(String[] args)
    {

        Shape circle = new Circle();
        Shape triangle = new Triangle();
        circle.draw();
        circle.erase();
        triangle.draw();
        triangle.erase();

    }
}