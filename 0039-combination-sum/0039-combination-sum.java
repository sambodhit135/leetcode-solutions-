
class Solution {
    List<List<Integer>> finallist = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        helper(0, 0, candidates, target, list);
        return finallist;
    }

    public void helper(int i, int sum, int[] nums, int target,
            ArrayList<Integer> list) {

        if (sum == target) {
            finallist.add(new ArrayList<>(list));
            return;
        }

        if (i == nums.length || sum > target) {
            return;
        }

        // TAKE nums[i]
        list.add(nums[i]);
        helper(i, sum + nums[i], nums, target, list);

        // BACKTRACK
        list.remove(list.size() - 1);

        // DON'T TAKE nums[i]
        helper(i + 1, sum, nums, target, list);
    }
}
