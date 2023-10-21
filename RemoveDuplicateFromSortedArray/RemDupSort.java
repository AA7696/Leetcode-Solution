// Question 2

import java.util.Arrays;


public class RemDupSort {
    public int[] removeDuplicates(int[] num) {
        int[] arr = new int[num.length];
        int count = 1;
        arr[0] = num[0];
        for (int i = 0; i< num.length; i++){
            for (int j = i+1; j< num.length; j++){
                if (num[i] != num[j]){
                    arr[count] = num[j];
                    count++;
                    i=j;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] num = new int[]{0,0,0,1,1,2,2,2};
        RemDupSort s = new RemDupSort();

       int[] result =  s.removeDuplicates(num);
        System.out.println(Arrays.toString(result));
    }

}


// Use Two pointer approach  Improve the code 

    // public int removeDuplicates(int[] num) {
    //          int count = 0;
    //          num[count] = num[0];
    //     for (int i = 0; i< num.length; i++){
    //             if (num[count] != num[i]){
    //                 count++;
    //                 num[count] = num[i];
    //         }
    //     }
        
    //     return count+1;

    // }
