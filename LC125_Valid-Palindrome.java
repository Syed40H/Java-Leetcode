class Solution {
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length()-1;
        while(l<r) {
            // Move left pointer until we find a letter or digit
            while(l<r && !Character.isLetterOrDigit(s.charAt(l))) l++;
            // Move right pointer until we find a letter or digit
            while(l<r && !Character.isLetterOrDigit(s.charAt(r))) r--;
            // Compare both chars (in lowercase)
            if(Character.toLowerCase(s.charAt(l++)) != Character.toLowerCase(s.charAt(r--))) return false;
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
*\