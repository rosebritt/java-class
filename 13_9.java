import java.io.*;
import java.util.Scanner;
import java.lang.Comparable;
class GeometricObject
{double area;
public double getArea()
{
return(area);
}

}
class Circle extends GeometricObject implements Comparable
{
double radius;
Circle(double r)
{
radius=r;
}
public double getArea()
{
return(3.143*(radius*radius));
}
  
public int compareTo(Object obj)
{
Circle c1=(Circle)obj;
  
if(radius==c1.radius)
return 0;
else if(radius>c1.radius)
return 1;
else
return -1;
}

}
class TestCircle
{
public static void main(String[] args)throws IOException
{
Circle c1=new Circle(5.0);
Circle c2=new Circle(2.0);
Circle c3=new Circle(5.0);
System.out.println("compare c1 and c2: "+c1.compareTo((Object)c2));
System.out.println("compare c2 and c3: "+c2.compareTo((Object)c3));
System.out.println("compare c3 and c1: "+c3.compareTo((Object)c1));
System.out.println("c1 Area:"+c1.getArea());
System.out.println("c2 Area:"+c2.getArea());
System.out.println("c3 Area:"+c3.getArea());
  
}
}
