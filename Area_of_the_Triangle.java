import java.util.Scanner;
public class areaOfTriange{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Double a=sc.nextDouble();
        Double b=sc.nextDouble();
        Double c=sc.nextDouble();
        Double s=(a+b+c)/2;
        Double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",area);
    }
}