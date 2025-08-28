// this a programm to otate the array of d orders 

public class R2 {
    public static int [] rot(int [] arr , int d , int n ){

        //Time complexity optimize krne k liye jisse large order me unneccesary iteration na hoyeeee
        d = d%n;

        // temp me elements store krenge
        int temp  [] = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        /// Shifting krenge

        for (int i = d; i < n; i++) {
            arr[i-d] = arr[i];
            
        }

        // Aray me pushback krenge temp ke elements
        for(int i=n-d;i<n;i++){
            arr[i] = temp[i - (n-d)];
        }

        return arr;

    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};

         int n = arr.length;
         int d = 2;
        int [] result =  rot(arr, d , n);
        
        for(int i=0;i<result.length;i++){
            System.out.print(result[i] + " , ");
        }
    }
}
