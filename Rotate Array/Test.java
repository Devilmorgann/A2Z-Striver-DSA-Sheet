public class Test{
    public static int [] func(int [] arr , int k , int n ){

         k = k%n;
        int [] temp = new int[k];
        for(int i=0;i<k;i++){
            temp[i] = arr[i];
        }

        for(int i=k;i<n ; i++){
            arr[i-k] = arr[i];
        }

        for (int i = 0; i < k; i++) {
            arr[n-k+i] = temp[i];
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8}; int n = arr.length;
         int k = 3;

         int [] result = func(arr, k, n);
         for(int i=0;i<result.length;i++){
            System.out.print(result[i] + " ");
         }

    }
}