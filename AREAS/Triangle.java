import java.util.Scanner;
public class Triangle 
{
 public void area ()
 {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the base value of Triangle:");
       double base = scanner.nextDouble();
       System.out.println("Enter the height value of Triangle:");
       double height = scanner.nextDouble();
       double area = (base*height)/2;
       System.out.println("Area of Triangle is:"+area);
 }
}