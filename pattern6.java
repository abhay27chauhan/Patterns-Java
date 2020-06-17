import java.util.*;

class pattern6{
     
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int count = 1; 
        System.out.print("Enter the value of n: ");
        int n = scn.nextInt();
        for(int cr=1; cr<=n; cr++){
            for(int cc=1; cc<=cr; cc++){
                System.out.print(count + " ");
                count++;
            }System.out.println();
        }

    }
}