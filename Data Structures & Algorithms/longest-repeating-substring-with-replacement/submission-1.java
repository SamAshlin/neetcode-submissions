class Solution {
    public int characterReplacement(String s, int k) {
        
        int count[] = new int[26];

        int n=s.length();
        int left=0;
        int maxfreq=0;
        int answer=0;

        for(int right=0;right<n;right++){
            count[s.charAt(right)-'A']++;

            maxfreq=Math.max(maxfreq,count[s.charAt(right)-'A']);

            if((right-left+1)-maxfreq>k){
                count[s.charAt(left)-'A']--;
                left++;
            }
            answer=Math.max(answer,right-left+1);
        }
        return answer;
    }
}
