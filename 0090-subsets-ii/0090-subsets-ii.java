class Solution {

    HashSet<List<Integer>> set=new HashSet<>();
    public List<List<Integer>> subsetsWithDup(int[] arr) {
        ArrayList<Integer> list=new ArrayList<>();
        helper(arr,0,list);
        List<List<Integer>> finallist=new ArrayList<>(set);
        return finallist;
    }
    public void helper(int arr[], int i, ArrayList<Integer> list)
    {
        if(i==arr.length)
        {
            ArrayList<Integer> temp=new ArrayList<>(list);
            Collections.sort(temp);
            set.add(new ArrayList<>(temp));
            return;
        }
        
        list.add(arr[i]);
        helper(arr,i+1,list);
        
        list.remove(list.size()-1);
        helper(arr,i+1,list);
    }
}