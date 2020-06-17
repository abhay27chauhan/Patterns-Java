import java.util.*;

class pattern4{

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scn.nextInt();
        int sp = n/2;
        int st = 1;
        for(int cr=1; cr<=n; cr++ ){
            for(int csp = 1; csp<=sp; csp++){
                System.out.print(" ");
            }for(int cst = 1; cst<=st; cst++){
                System.out.print("*");
            }
            if(cr<=n/2){
                sp--;
                st += 2;
            }else{
                sp++;
                st -=2;
            }System.out.println();
        }
    }
}