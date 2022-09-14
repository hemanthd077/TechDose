package BeginersProblem;

import java.util.*;

public class _14perfectSquare {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a,b,c,d;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        if(a==b && b==c && c==d){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}
