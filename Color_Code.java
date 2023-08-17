import java.util.Scanner;
public class Color{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char s=sc.nextLine().charAt(0);
        if(s=='V' || s=='v'){
            System.out.println("Voilet");
        }
        else if(s=='I' || s=='i'){
            System.out.println("Indigo");
        }
        else if(s=='B' || s=='b'){
            System.out.println("Blue");
        }
        else if(s=='G' || s=='g'){
            System.out.println("Green");
        }
        else if(s=='Y' || s=='y'){
            System.out.println("Yellow");
        }
        else if(s=='O' || s=='o'){
            System.out.println("Orange");
        }
        else if(s=='R' || s=='r'){
            System.out.println("Red");
        }
        else{
            System.out.println("-1");
        }
    }
}