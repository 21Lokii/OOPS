public class Area {
public static void main(String[] args) {
double area;
Shape s;
Rectangle r=new Rectangle();
 s=r;
s.input();
area=s.compute_area();
System.out.println("Area of Rectangle: "+ area);
Triangle t=new Triangle();
s=t;
s.input();
area=s.compute_area();
System.out.println("Area of Triangle: "+ area);
}
}
