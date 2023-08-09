import java.util.Scanner;
public class tempConvertions{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Double c=sc.nextDouble();
        System.out.printf("%.2f",32+((c*9)/5));
    }
}