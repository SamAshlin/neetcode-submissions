class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n=nums.length;
        int pro[]=new int[n];
        for(int i=0;i<n;i++){
            int prod=1;
            int j=0;
            while(j<n){
                if(j!=i){
                prod=prod*nums[j];
                }
                j++;
            }
        pro[i]=prod;   

        }

        return pro;
    }
}  
