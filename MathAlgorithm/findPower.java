//Find the number power.

import java.util.*;

class Find{
    public long check(long base,long power){
        int res=1;
        while(power>0){
            if(power%2==1){
                res*=base;
            }
            base*=base;
            power/=2;
        }
        return res;
    }
}

class findPower {
    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        
        System.out.println("Enter the base:");
        long base=sc.nextInt();
        
        System.out.println("Enter the Power:");
        long power=sc.nextInt();
        
        Find a = new Find();
        System.out.println("The output = "+a.check(base,power));
    }
}