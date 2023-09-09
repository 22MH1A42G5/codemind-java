import java.util.*;
public class Average{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Double n=sc.nextDouble();
        Double s=0.0;
        ArrayList<Double> arr=new ArrayList<Double>();
        for(int i=0;i<n;i++){
            arr.add(sc.nextDouble());
        }
        for(Double i:arr){
            s+=i;
        }
        Double avg=s/n;
        System.out.printf("%.2f",avg);
    }
}
