import java.util.Arrays;

public class InsertAtEnd {
    public int[] insert(int[] arr, int elem) {
        int newarr[] = new int[arr.length+1];
        for (int i=0;i<arr.length;i++){
            newarr[i] = arr[i];

        }
        newarr[newarr.length - 1]=elem;
       return newarr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,3,4};
        int elem = 5;
        InsertAtEnd obj = new InsertAtEnd();

        int[] result = obj.insert(arr, elem);

        System.out.println(Arrays.toString(result));
    }
    
}
