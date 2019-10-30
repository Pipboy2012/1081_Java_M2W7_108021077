import java.util.Scanner;
public class M2Q7{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int v1 = scn.nextInt();
        int a,b,c;
        for(int i=0;i<v1;i++){
            a = scn.nextInt();
            b = scn.nextInt();
            c = scn.nextInt();
            if(a >= 60 && b >= 60 && c >= 60){
                System.out.println("P");
            }else if(((a >= 60 && b >= 60) || (b >= 60 && c >= 60) ||(a >= 60 && c >= 60))){
                if(a+b+c >= 220){
                    System.out.println("P");
                }else{
                    System.out.println("M");
                }
            }else if(a >= 80 || b >= 80 || c >= 80){
                System.out.println("M");
            }else{
                System.out.println("F");
            }
        }
    }
}