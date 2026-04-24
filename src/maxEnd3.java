public class maxEnd3 {
    public static void main (String[] args){
        System.out.println();
        System.out.println();
    }
    public static int[] maxEnd3 (int[] nums){
        int max = Math.max(nums[0], nums[2]);
        return new int[]{max, max, max};

    }
}
