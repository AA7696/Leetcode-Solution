

public class SortedArray {

    public boolean sortedArray(int[] arr){
        for(int i = 1; i <arr.length; i++){
            if(arr[i-1] > arr[i]){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        int [] arr = new int[]{2,3,4,5,1};
        SortedArray s = new SortedArray();

        boolean res = s.sortedArray(arr);

        System.out.println(res);
    }
}
