/* reverse the string  */
public class rev {

     static void   reverse(String str){

        int n = str.length();
        for(int i = n-1;i>=0;i--){

            System.out.print(str.charAt(i));
        }

    }

    public static void main(String[] args) {
        String str = "Jhonson";

       reverse(str);

    

    }
}