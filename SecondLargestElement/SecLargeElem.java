
public class SecLargeElem {
    public int secMax(int arr[]) {
        int first = 0;
        int second = -1;
        for(int i = 0; i<arr.length; i++){
            if (arr[first] < arr[i]){
                second = first;
                first = i;
            }
            else if(arr[i] != arr[first]){
                if(second == -1 || arr[i] > arr[second]){
                    second = i;
                }
            }
        }
        return arr[second];
    }

    public static void main(String[] args) {
        int[] arr = new int[]{10,20,5};
        SecLargeElem s = new SecLargeElem();
        int result = s.secMax(arr);
        System.out.println(result);
    }
}
