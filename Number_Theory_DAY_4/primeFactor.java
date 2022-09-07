//Finding PrimeFactor of a Number.

import java.util.*;

class Find{
    public void primeFactor(long N){
        int div=2;
        while(N > 1){
            if(N % div == 0){
                System.out.print(d+" ");
                N /= div;
            }
            else{
                div++;
            }
        }
    }
}

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the Num:");
        long N=sc.nextInt();
        
        Find a = new Find();
        System.out.println("The output:");
        a.primeFactor(N);
    }
}