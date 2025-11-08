class Solution {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length()-1;

        while(left < right){
            // Move left pointer until we find a letter or digit
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))) left++;

            while(left<right && !Character.isLetterOrDigit(s.charAt(right))) right--;
            
            // Compare both chars (in lowercase)
            if(Character.toLowerCase(s.charAt(left++)) != Character.toLowerCase(s.charAt(right--))) return false;
        }
        return true;
        
    }
}



/*class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
        	return true;
        }
        int start = 0;
        int last = s.length() - 1;
        while(start <= last) {
        	char currFirst = s.charAt(start);
        	char currLast = s.charAt(last);
        	if (!Character.isLetterOrDigit(currFirst )) {
        		start++;
        	} else if(!Character.isLetterOrDigit(currLast)) {
        		last--;
        	} else {
        		if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
        			return false;
        		}
        		start++;
        		last--;
        	}
        }
        return true;
    }
}
*/