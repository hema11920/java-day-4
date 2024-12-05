import java.util.*;
public class decrement{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        //post decrement
        n=5;
        System.out.println(n--);
        //pre decrement
        a=4;
        System.out.println(--a);
    }
}      