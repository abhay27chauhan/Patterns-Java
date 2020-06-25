import java.io.*;
import java.util.*;

public class pattern9 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int sp = n-1;
        int val = 1;
        for(int cr=1; cr<=n; cr++){
            for(int csp=1; csp<=sp; csp++){
                System.out.print("  ");
            }
            int newcr = cr;
            for(int cv=1; cv<=val; cv++){
                
                System.out.print(newcr+ " ");
                newcr++;
            }
            int c = newcr-2;
            for(int cv=1; cv<val; cv++){
                
                System.out.print(c+ " ");
                c--;
            }
            
            for(int csp=1; csp<=sp; csp++){
                System.out.print("  ");
            }
            
            sp--;
            val = val+1;
            System.out.println();
        }
    }
}
