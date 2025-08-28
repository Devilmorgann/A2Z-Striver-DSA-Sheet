package Test.Searching;

public class Binary {

    public static void main(String[] args) {
        int key = 3;
        int arr[] = {1,2,3,4,5,6,7,8};

        int low = arr[0];

    
    int mid;
  
    int high = arr[arr.length - 1 ];

    while(low<=high){
        mid = (low+high)/2;
    }

    if(key == mid){
       System.out.println(mid);;
    }
    
    if(key<mid){
        for (int i = low; i <=mid ; i++) {
            if (arr[i] == key) {
               System.out.println(arr[i]);
            }
        }
    }


    else{
        for(int i=mid;i<=high ;i++){
            if (arr[i] == key) {
              System.out.println(arr[i]);
            }
            
        }
    }


}
}