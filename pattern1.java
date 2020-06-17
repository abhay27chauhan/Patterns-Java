import java.util.*;

class pattern1{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Eneter the number: ");
        int n = scn.nextInt();
        for(int cr=1;cr<=n;cr++){
            for(int cc=1;cc<=n;cc++){
                System.out.print("* ");
            }System.out.println();
        }
    }
}