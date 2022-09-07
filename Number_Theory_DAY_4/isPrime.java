// Number is prime or not.

import java.util.*;

class calc{
    public boolean prime(int N){
        for(int i=2; i*i<=N; i++){
            if(N%i==0){
                return false;
            }
        }
        return true;
    }
}

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Number:");
        int N=sc.nextInt();
        
        calc obj = new calc();
        System.out.println((obj.prime(N) ? "Prime Number" : "Not a Prime Number"));
    }
}
