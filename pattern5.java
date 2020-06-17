import java.util.*;

class pattern5{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scn.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==j || i == (n-j+1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }
}