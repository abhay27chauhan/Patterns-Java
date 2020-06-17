import java.util.*;

class pascalTriangle{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scn.nextInt();

        for(int cr=0; cr<n; cr++){
            int ncr =1;
            for(int cc=0; cc<=cr; cc++){
                System.out.print(ncr + " ");
                int ncr1 = (ncr*(cr-cc)/(cc+1));
                ncr =ncr1;
            }System.out.println();
        }
    }
}