public class LargestElem {

    public int largest(int arr[]){

        int largest = 0;

        for(int i = 0; i<arr.length; i++){
            if(arr[largest] < arr[i]){
                largest = i;
            }
        }

        return arr[largest];
    }

    public static void main(String[] args) {
        int[] arr = new int[]{10,20,5};
        LargestElem l = new LargestElem();

        int result = l.largest(arr);

        System.out.println(result);
    }
}


