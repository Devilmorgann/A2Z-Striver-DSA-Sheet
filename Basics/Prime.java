import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        int n ;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
      
        System.out.println(prime(n));
    }

    static boolean prime(int n){
        int cnt = 0;

        for(int i = 1; i<=n;i++){
          if (n%i == 0) {
            cnt++;
          }
        }
         
        if (cnt == 2) {
            return true;
        }

        return false;
    }
}