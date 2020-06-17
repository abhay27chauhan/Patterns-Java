import java.util.*;

class pattern2{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scn.nextInt();
        for(int cr=1; cr<=n; cr++){
            for(int cc=1; cc<=cr; cc++){
                System.out.print("* ");
            }System.out.println();
        }
    }
}