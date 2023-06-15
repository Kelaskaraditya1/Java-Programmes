abstract class Shape
{
    abstract void noofsides();
    
}
class Triangle extends Shape
{
public void noofsides()
{
    System.out.println("Triangle has 3 sides");
}
}
public class Shapetype
{
public static void main(String[] args)
{
    Triangle t = new Triangle();
    t.noofsides();
}

}