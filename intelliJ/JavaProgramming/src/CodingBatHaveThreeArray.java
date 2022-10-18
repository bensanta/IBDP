//TODO:Given an array of ints, return true if the value 3 appears in
// the array exactly 3 times, and no 3's are next to each other.

public class CodingBatHaveThreeArray {
    public static void main(String[] args) {

    }
    public static boolean haveThree(int[] nums){

        int countOf3 = 0;

        int numsPrev = 0;

        for(int i = 0; i < nums.length; i++){

            if(nums[i] == 3){
                countOf3++;
            }

            if (numsPrev == 3){
                return false;
            }
            numsPrev = nums[i];
        }
        if (countOf3 == 3){
            return true;
        }
        return false;
    }
}
