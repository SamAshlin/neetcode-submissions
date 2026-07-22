class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int max = 0;
        int res=0;

        int left=1;
        int right=0;

        for (int pile : piles) {
            right = Math.max(right, pile);
        }

        while(left<right){

            int mid=(left+right)/2;
            int th=0;
            for(int pile: piles){

                int ch= (int)Math.ceil((double)pile / mid);
                th=th+ch;
            }
            if(th<=h){
                right=mid;
            }
            else{
                left=mid+1;
            }
        }

        return right ;
        
    }
}
