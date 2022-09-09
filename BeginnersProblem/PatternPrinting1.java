package BeginersProblem;

import java.util.Scanner;

class PatternPrinting1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        final int n= sc.nextInt();
        for(int i=n;i>0;i--){
            for(int j=n;j>=((n+1)-i);j--){
                System.out.print(j+" ");
            }
            System.out.print("\n");
        }
    }
}
