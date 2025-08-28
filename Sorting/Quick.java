class Quick{

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public  int [] implement(int [] nums){
        sort(nums,0,nums.length-1);
        return nums;
    }

    static int Partition(int[] nums , int low,int high){
        int pivot = nums[high];

        int i = low - 1;

        for(int j=low;j<high;j++){
            if (nums[j]<=pivot) {
                i++;
                swap(nums, i, j);
            }       
        }

            swap(nums, i + 1, high);  
            return i + 1;

    }



    static void  sort(int [] nums, int low , int high){
          
        if (high > low) {
            int pi =  Partition(nums, low, high);

            sort(nums, pi+1, high);
            sort(nums, low, pi-1);
            

        }
    }


    public static void main(String[] args) {
        int [] nums = {23,12,4,55,33,18,9,22,1};

         Quick Obj = new Quick();
         Obj.implement(nums);

        for(int value : nums){
            System.out.print(value+",");
        }
    }
}