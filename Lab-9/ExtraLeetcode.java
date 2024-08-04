class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int count = 0;
        int max = 0;
        
        for(int i = 0 ; i < s.length() ; i++){
            char first = s.charAt(i);
            for(int j = 0 ; j < s.length() ; j++){
                if(s.charAt(j) != first){
                    for(int k = i ; k < j ; k++){
                        if(s.charAt(k) == s.charAt(j)){
                            count = count;
                            continue;
                        }
                        else{
                            count++;
                        }
                    }
                }
            }
            max = Math.max(count , max);
        }
       return max;
    }
}