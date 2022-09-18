package BeginnersProblem;

import java.util.Scanner;

public class _10PalindromeString {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int len = str.length();
        int j=len-1;
        for(int i=0;i<=len/2;i++){
            if(str.charAt(i)!=str.charAt(j)){
                System.out.println("NO");
                return;
            }
            j--;
        }
        System.out.println("YES");
    }
}
