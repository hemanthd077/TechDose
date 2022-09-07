// Finding GCD of two number.

import java.util.*;

class Find{
    public long GCD(long A,long B){
      return A==0 ? B : GCD(B%A,A);
    }
}

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Num1:");
        long A=sc.nextInt();
 
        System.out.println("Enter the Num2:");
        long B=sc.nextInt();
 
        Find a = new Find();
        System.out.println("The output = "+a.GCD(A,B));
    }
}