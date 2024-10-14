import java.util.*;
import java.lang.*;
import java.io.*;

public class javasolu {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int test = scn.nextInt();
        for (int t = 0; t < test; t++) {
            String str =  scn.next();
            int cnt0 = 0;
            int cnt1 = 0 ;
            int paircnt=0;
            for(int i = 0 ; i<str.length() ; i++){
                if(str.charAt(i)=='0')cnt0++;
                else cnt1++;
            }
            paircnt = Math.min(cnt1, cnt0);
            if(paircnt%2==0) System.out.println("NET");
            else System.out.println("DA");

        }
    }
}