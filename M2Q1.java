import java.util.Scanner;

public class M2Q1{
    public static void main(String[]args){
         Scanner scn = new Scanner(System.in);
         float v1 = scn.nextFloat();
         float maxval = v1;
         float minval = v1;
         for(int i = 1;i<10;i++){
             v1 = scn.nextFloat();
             if(maxval<v1){
                 maxval=v1;
             }else if (minval>v1){
                 minval=v1;
             }
         }System.out.println(maxval);
         System.out.println(minval);
    }
}