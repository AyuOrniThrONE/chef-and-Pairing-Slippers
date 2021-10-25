import java.util.Scanner;

public class chefNDpairingSlippers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        if (1<=t && t<=1000 ) {
            for (int i = 0; i < t; i++) {
                int n=sc.nextInt();
                int l=sc.nextInt();
                int x=sc.nextInt();
                int amount=0;
                if (0<=l && l<=n && n<=1000) {
                    if (n==0) {
                        amount=0;
                    }else if (n>1) {
                        if (l<=n/2) {
                            amount=l*x;
                        }else{
                            amount=(n-l)*x;
                        }
                    }
                }
                System.out.println(amount);
            }
        }
    }
}
