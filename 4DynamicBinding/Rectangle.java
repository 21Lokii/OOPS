public class Rectangle extends Shape 
{
double area;
//@Override 
public double compute_area() {
height=this.getHeight();
 width=this.getWidth();
area=height*width;
return area;
}
}