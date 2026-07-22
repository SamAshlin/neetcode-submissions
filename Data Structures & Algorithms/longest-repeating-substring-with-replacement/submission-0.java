class Solution {
    public int characterReplacement(String s, int k) {

        int arr[]=new int[26];

        int left=0;
        int maxfreq=0;
        int answer=0;

        for(int right=0;right<s.length();right++){

            arr[s.charAt(right)-'A']++;

            maxfreq=Math.max(maxfreq,arr[s.charAt(right)-'A']);

            if((right-left+1)-maxfreq>k){
                arr[s.charAt(left)-'A']--;
                left++;
            }

            answer=Math.max(answer,right-left+1);
        }
        return answer;
    }
}
