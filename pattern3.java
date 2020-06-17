import java.util.*;

class pattern3{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scn.nextInt();
        int st= n;
        int sp = 0;

        for(int cr=1; cr<=n; cr++){
            for(int csp =1; csp<=sp; csp++){
                System.out.print(" ");
            }for(int cst= 1; cst<=st; cst++){
                System.out.print("*");
            } st--;
            sp++;
            System.out.println();
        }
    }
}