public class Bubble {

    public static int[] bubble(int [] arr,int k){

        if (arr == null && k < 0) {
            throw new IllegalArgumentException("Illeagel Argument");
        }

              for (int i = 0; i < k; i++) {
                for (int j = arr.length - 1; j>0; j--) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
              }

              return arr;
        }
  public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        int k = 3;

        int [] result = bubble(arr, k);
        
        for(int i=0;i<arr.length;i++){
            System.out.print(result[i] + " , ");
        }
    }  
}
