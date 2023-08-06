import java.util.Scanner;

public class Arrow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the  number :");
        int n = in.nextInt();
        for (int i=1 ;i<2*n; ++i){
            if(i<=n){
                for(int j = 1;j<i;j++){
                    System.out.print('-');
                }
                System.out.println();
            }
            else{
                for(int k=n;k>i-n;k--){
                    System.out.print("-");
                }
                System.out.println("");
            }
        }
    }

}
