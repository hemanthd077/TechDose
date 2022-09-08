//Finding PrimeFactor of a Number.

import java.util.*;

class Find{
    public void primeFactor(long N){
        int div=2;
        while(N > 1){
            if(N % div == 0){
                System.out.print(div+" ");
                N /= div;
            }
            else{
                div++;
            }
        }
    }
}

class HelloWorld {
    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println("Enter the Num:");
        long N=sc.nextInt();
        
        Find a = new Find();
        System.out.println("The output:");
        a.primeFactor(N);
    }
}