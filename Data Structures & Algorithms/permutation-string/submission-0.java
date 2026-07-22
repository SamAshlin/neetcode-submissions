class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        int l1=s1.length();
        int l2=s2.length();

        if(l1>l2){
            return false;
        }

        int c1[] =new int[26];
        int c2[] =new int[26];

        for (int i = 0; i < l1; i++) {
            c1[s1.charAt(i) - 'a']++;
            c2[s2.charAt(i) - 'a']++;
        }

        if (Arrays.equals(c1, c2))
            return true;

        int left=0;
        int right=left+l1;

        while(right<l2){
            c2[s2.charAt(left)-'a']--;
            c2[s2.charAt(right)-'a']++;

            left++;
            right++;

            if(Arrays.equals(c1,c2)){
                return true;
            }
        }

        return false;
    }
}
