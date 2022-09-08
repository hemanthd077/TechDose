//Finding PrimeFactor of a Number.

import java.util.*;

class findFactor{
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

class primeFactor {
    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println("Enter the Num:");
        long N=sc.nextInt();
        
        findFactor a = new findFactor();
        System.out.println("The output:");
        a.primeFactor(N);
    }
}