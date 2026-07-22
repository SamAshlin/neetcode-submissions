class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        int n=temperatures.length;
        int output[]=new int[n];
        for(int i=0;i<n;i++){
            int count=1;
            for(int j=i+1;j<n;j++){
                if(temperatures[i]<temperatures[j]){
                    output[i]=count;
                    break;
                }
                else{
                    count++;
                }
            }   
        }
        return output;
    }
}
