import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] num, int target) {
        int[] index = new int[2];
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if (i != j) {
                    if (num[i] + num[j] == target) {
                        index[0] = i;
                        index[1] = j;
                    }
                }
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] num = new int[]{2,7,11,15};
        int target = 9;
        TwoSum s = new TwoSum();
        int[] result =  s.twoSum(num, target);
        System.out.println(Arrays.toString(result));
    }

}
