public class rotate{

    public static int []  rotate(int [] arr , int k){

        if (k > arr.length) {
            k = k%arr.length;
        }

        int [] result = new int[arr.length];

        for (int i = 0; i < k; i++) {
            result[i] = arr[arr.length-k+i];
            
        }

        int j=0;

        for (int i = k; i < arr.length; i++) {
            result[i] = arr[j];
            j++;
        }

       // System.arraycopy(arr, j, result, k, j);
        
       return result;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        int k = 3;

        int [] result = rotate(arr, k);
        
        for(int i=0;i<result.length;i++){
            System.out.print(result[i] + " , ");
        }
    }
}