import java.util.Scanner;

public class M2Q10{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                System.out.print( (i*j) + "\t");
            }
            System.out.println();
        }
    }
}