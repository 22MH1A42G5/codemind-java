import java.util.*;
public class MaxiMini{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double n=sc.nextInt();
        double temp;
        double sum=0.0;
        ArrayList<Double> arr=new ArrayList<Double>();
        ArrayList<Double> arr1=new ArrayList<Double>();
        for(int i=0;i<n;i++)
        arr.add(sc.nextDouble());
        for(int i=0;i<n;i++){
            temp=Collections.frequency(arr,arr.get(i));
            if((arr.get(i)==temp) && arr1.contains(arr.get(i))==false){
                arr1.add(arr.get(i));
            }
        }
        if(arr1.size()==0){
            System.out.println(-1);
            return;
        }
        for(int i=0;i<arr1.size();i++){
            sum+=arr1.get(i);
        }
        double avg=sum/arr1.size();
        System.out.printf("%.2f",avg);
    }
}