//In this question you have to return a product of consecutive integers of an arry which have maximum product
class SW{
    public static int maxx(int [] arr,int k){
        if(arr.length<k) return -1;
        
        int max = Integer.MIN_VALUE;
        int current = 1;
        
        for(int i=0;i<k;i++){
            current *= arr[i];
        }
        
        max = current;
        
        //Sliding Window Protocol chlega
        for(int i=k;i<arr.length;i++){
            if(arr[i-k] != 0){
                current = (current/arr[i-k])*arr[i];
            }
            
            else{
                current = 1;
                for(int j = i-k+1;j<=i;j++){
                    current *= arr[j];
                }
            }
            
            
            max = Math.max(max,current);
            
        }
   
        return max;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,5,6,7,8};
        int k = 3;
        int result = maxx(arr, k);
        System.out.println(result);
    }
}