import java.util.*;

class pattern7{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scn.nextInt();
        int a= 0, b=1, f=a+b;
        for(int cr=1; cr<=n; cr++){
            for(int cc=1; cc<=cr; cc++){
                System.out.print(a + " ");
                a=b;
                b=f;
                f=a+b;
            }System.out.println();
        }
    }
}