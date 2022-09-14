
import java.util.*;

public class _19PerfectSquare {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i*i <= num;i++){
            if(num%i==0 && num/i==i){
                System.out.print("TRUE");
                return;
            }
        }
        System.out.print("FALSE");
    }
}
