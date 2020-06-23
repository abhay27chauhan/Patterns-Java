import java.util.*;

public class Pattern8.java{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
            
        int n = scn.nextInt();
        int st = n/2+1;
        int sp =1;
        
        for(int cr =1; cr<=n; cr++){
            for(int cst = 0; cst<st; cst++){
                System.out.print("*");
            }
            for(int csp=0; csp<sp; csp++){
                System.out.print(" ");
            }
            for(int cst = 0; cst<st; cst++){
                System.out.print("*");
            }
            
            if(cr<n/2+1){
                st--;
                sp = sp+2;
            }else{
                st++;
                sp = sp-2;
            }
            System.out.println();
            
        }
    }
}
