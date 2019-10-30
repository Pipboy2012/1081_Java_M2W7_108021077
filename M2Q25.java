import java.util.Scanner;
public class M2Q25{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = 0;
        int tmp;
        for(int i=2;i<=n;i++){
            tmp = i;
            for(int j=0;j<=i/2;j++){
                if(tmp%2==0){
                    tmp /= 2;
                }else if(tmp%3==0){
                    tmp /= 3;
                }else  if(tmp%5==0){
                    tmp /= 5;
                }
            }
            if(tmp==1){
                ans+=i;
            }
        }
        System.out.println(ans);
    }
}