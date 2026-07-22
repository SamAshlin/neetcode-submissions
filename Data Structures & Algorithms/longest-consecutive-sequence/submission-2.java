class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> set=new HashSet<>();

        for(int num: nums){
            set.add(num);
        }

        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        int max=0;

        for(int num: list){
            int current=num;
            int longest=1;

            while(list.contains(current+1)){
                longest=longest+1;
                current=current+1;
            }
            max=Math.max(max,longest);
            
        }

        return max;
    }
}
