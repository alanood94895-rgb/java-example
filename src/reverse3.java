public class reverse3 {
    public static void main (String[] args){

        System.out.println(reverse3(new int[] {1, 2, 3} )); // {3,2,1}
        System.out.println(reverse3 (new int[]{5, 11, 9}));
    }
public static int[] reverse3 (int[] nums){
        return new int[]{nums[2],nums[1],nums[0]} ;
    }
}

