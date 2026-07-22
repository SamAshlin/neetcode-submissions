class Solution {
    public boolean isPalindrome(String s) {

        String str= s.toLowerCase();

        List<Character> list=new ArrayList<>();

        for(char c: str.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                list.add(c);
            }
        }
        System.out.println(list);

        int left=0;
        int right=list.size()-1;

        while(left<=right){
            if(list.get(left)!=list.get(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
        
    }
}
