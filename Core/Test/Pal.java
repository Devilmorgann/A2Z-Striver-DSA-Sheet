package Test;

public class Pal {

    static void  pal(int n){

      int temp = n;
      int r = 0 ;

      while (temp != 0 ) {
        r = r*10 +  (temp%10);
        temp = temp/10;
      }

      if (r == n) {
        System.out.println("Palindrome");
      }

      else System.err.println("Not palindrome");
     
     

    }
    
    public static void main(String[] args) {
        int n = 101;
        pal(n);
    }
}
