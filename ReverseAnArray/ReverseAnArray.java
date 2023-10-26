import java.util.Arrays;

/**
 * ReverseAnArray
 */
public class ReverseAnArray {
    public int[] reverse(int[] arr){
        int l = arr.length-1;
        if (arr == null || arr.length <= 1) {
            return arr;
        }else{
            for (int i = 0; i < arr.length / 2; i++) {
                int temp = arr[i];
                arr[i] = arr[l];
                arr[l] = temp;
                l--;
            }

        }
        
        return arr;
    }

    public static void main(String[] args) {
        int [] arr = new int[]{1,3,5,7};
        ReverseAnArray r = new ReverseAnArray();

        int[] result = r.reverse(arr);

        System.out.println(Arrays.toString(result));
    }

    
}