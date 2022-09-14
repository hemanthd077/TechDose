package BeginersProblem;

import java.util.*;

public class _18DigitsInInteger {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        long num = sc.nextLong();
        _18DigitsInInteger.display(num);
    }

    static void display(long n){
        if(n==0){
            return;
        }
        long r=n%10;
        display(n/10);
        System.out.print(r+" ");
    } 
}
