package Test.Searching;

import java.util.Scanner;

public class linear {

    public static int search(int [] arr,int key){

        if (arr == null){
            return -1;
        }

        else{
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == key) {
                    return i;
                }
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        
        int [] arr = {12,34,54,32,23,123,45,65,78};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter te key u wis to search");
        int key = sc.nextInt();
        int result = search(arr,key);

        sc.close();

        
        if (result == -1) {
            System.out.println("Key doesn't found");
        }

        else {
            System.out.println("Key found at index: " + result);
        }
    }
}