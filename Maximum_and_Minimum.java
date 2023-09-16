import java.util.*;
public class MaxiMini{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp,min=100000000,max=0;
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        arr.add(sc.nextInt());
        Collections.sort(arr);
        for(int i=0;i<n;i++){
            temp=Collections.frequency(arr,arr.get(i));
            if(arr.get(i)==temp){
                min=arr.get(i);
                break;
            }
            else{
                min=-1;
            }
        }
        for(int i=n-1;i>=0;i--){
            temp=Collections.frequency(arr,arr.get(i));
            if(arr.get(i)==temp){
                max=arr.get(i);
                break;
            }
            else{
                max=-1;
            }
        }
        if(min==-1 && max==-1){
            System.out.println(-1);
        }
        else
        System.out.print(min+" "+max);
    }
}