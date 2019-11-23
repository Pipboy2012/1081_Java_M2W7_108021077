import java.util.Scanner;

public class M2Q20{
    public static void main(String[]args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i=2;i<=n;i++){
            boolean bool = true;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    bool = false;
                    break;
                }
            }
            if(bool){
                System.out.println(i);
            }
        }
    }
}