class CircleArea //methodoverloading
{
 double area(double x)
 {
  return 3.14 * x;
 }
}

class SquareArea 
{
 int area(int x)
 {
  return x * x;
 }
}

class RectangleArea 
{
 int area(int x, int y)
 {
  return x * y;
 }
}

class TriangleArea 
{
 int area(int y, int x)
 {
  return (y * x)/2;
 }
}

class Overloading 
{
 public static void main(String args[])
 {
  CircleArea ca = new CircleArea();
  SquareArea sa = new SquareArea();
  RectangleArea ra = new RectangleArea();
  TriangleArea ta = new TriangleArea();

  System.out.println("Circle area = "+ ca.area(1));
  System.out.println("Square area = "+ sa.area(2));
  System.out.println("Rectangle area = "+ ra.area(3,4));
  System.out.println("Triangle area = "+ ta.area(6,3));
 }
}