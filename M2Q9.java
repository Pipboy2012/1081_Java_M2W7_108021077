import java.util.Scanner;

public class M2Q9{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n2 = scn.nextInt();
        int n1 = scn.nextInt();
        if(n2>n1){

            for(int i = n1;i>=1;i--){
                if(n2%i==0&&n1%i==0){
                    System.out.println(i);
                    break;
                }
            }

            for(int j = n2;j>=1;j++){
                if(j%n1==0&&j%n2==0){
                    System.out.println(j);
                    break;
                }
            }

        }

        else if(n1>n2){

            for(int i = n1;i>=1;i--){
                if(n2%i==0&&n1%i==0){
                    System.out.println(i);
                    break;
                }
            }

            for(int j = n2;j>=1;j++){
                if(j%n1==0&&j%n2==0){
                    System.out.println(j);
                    break;
                }
            }

        }


    }
}