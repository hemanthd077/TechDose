package BeginnersProblem;

import java.util.*;

public class _3LCMofTwoNum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int max = (num1>num2)?num1:num2;
        while(true){
            if(max % num1 ==0 && max % num2==0){
                System.out.println(max);
                break;
            }
            max++;
        }
    }
}
