import java.util.*;
public class daysusingswitchstmt{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();
        switch(day){
            case 1:
                System.out.println("monday");
                break;
            case 2: 
                System.out.println("tuesday");
                break;
            case 3:
                 System.out.println("wedsdayy");
                break;
            case 4:
                 System.out.println("thurseday");
                break;
            case 5:
                 System.out.println("friday");
                break;
            case 6:
                 System.out.println("saturday");
                break;
            case 7:
                 System.out.println("sunday");
                break;
            default:
                 System.out.println("this is invalid");
                break;
        }
        
        }
    }
