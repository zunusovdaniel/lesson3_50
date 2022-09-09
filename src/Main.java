import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] nums = {10, -1, 2,3};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                System.out.println(counter(Arrays.copyOfRange(nums, i + 1, nums.length)));
                break;
            }
        }
    }

    public static double counter(double[] nums) {
        double count = 0;
        for (double num: nums) {
            count += num;
        }
        return count / nums.length;

               /* int i = 0;
                boolean swich = false;
                if (num > 0) {
                    count = count + num;
                    i++;
                    System.out.println(count /= i);
                }else {
                    swich = true;
                    continue;

                }
            }*/
    }

}







