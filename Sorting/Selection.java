
class Sort{

    static void   sort(int[]nums){
        int n = nums.length;

      
        for (int i = 0; i < n-1; i++) {
              int min = i ;

              for(int j=i+1;j<n;j++){

                if (nums[j]<nums[min]) {
                    min = j;
                }
              }

              int temp = nums[i];
              nums[i] = nums[min];
              nums[min] = temp;

        }

         
    }


    
    static void printArray(int[] nums){
        for (int val : nums) {
            System.out.print(val + " ");
        }
        System.out.println();
    }



public static void main(String[] args) {
    int [] nums = {65,23,12,11,25,4};

    printArray(nums);

    sort(nums);
    printArray(nums);

    
    
   
}}