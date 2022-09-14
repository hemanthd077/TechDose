package BeginersProblem;
import java.util.*;

public class _17FrequencyOfChar {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        int len=str.length();
        int count[]=new int[26];
        for(int i=0;i<len;i++){
            count[(int)(str.charAt(i)-'a')]++;
        }
        for(int i=0;i<26;i++){
            if(count[i]>0){
                System.out.println((char)('a'+i)+" "+count[i]);
            }
        }
    }
}
