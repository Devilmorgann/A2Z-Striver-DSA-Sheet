public class Dup {

    public static void func(int []arr ){
          
        for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr.length; j++) {
            if (arr[i] == arr[j]) {
                System.out.println("Duplicate"+ " "+ arr[i]);
                break;
            }
        }
            
        }

       
    }

    public static void main(String[] args) { 
        int [] arr  = {1,2,3,4,5,6,9,0,9,9};
        func(arr);
    }
}