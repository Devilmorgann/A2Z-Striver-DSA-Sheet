/*Given an array arr of integers, find all the elements that occur more than once in the array. If no element repeats, return an empty array.

Examples:

Input: arr[] = [2, 3, 1, 2, 3]
Output: [2, 3] 
Explanation: 2 and 3 occur more than once in the given array. */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution{

    public static List<Integer> fundduplicate(int[] arr){
        List<Integer> duplicates = new ArrayList<>();
        Map<Integer,Integer > hmap = new HashMap<>();

        for(int num:arr){
            hmap.put(num,hmap.getOrDefault(num,0)+1); 
        }
        
        for(Map.Entry<Integer,Integer> entry : hmap.entrySet()){
            if(entry.getValue()>1){
                duplicates.add(entry.getKey());
        }


       
      }

      return duplicates;
     
   }
    public static void main(String[] args) {
   int arr[] = {1,2,3,4,5};
   System.out.println(fundduplicate(arr));
    }
}