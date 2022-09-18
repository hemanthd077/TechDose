package BeginnersProblem;

import java.util.*;

public class _8sumOfNaturalNum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        long sum=0;
        for(int i=1;i<=num;i++){
            sum+=i;
        }
        System.out.print(sum);
    }
}
