import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {
    /**
     * Determine if an array of items contains any duplicate values. You should use a Set for this: remember that
     * Sets can not have duplicate values, but you may check if a value is already contained using the .contains method.
     * @param nums an array of ints.
     * @return true if nums contains any duplicate values, false if it does not.
     */
    public boolean containsDuplicate(int[] nums){

        Set<Integer> contains_dups = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++){
            if(contains_dups.contains(nums[i])){
                return true;
            }
            contains_dups.add(nums[i]);
        }
        return false;
    }
}
