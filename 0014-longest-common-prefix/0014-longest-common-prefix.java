class Solution {
    public String longestCommonPrefix(String[] strs) {

        String words = strs[0];
        String result = "";

        for(int i = 0; i < words.length(); i++) {

            for(int j = 1; j < strs.length; j++) {

                if(i >= strs[j].length() ||
                   words.charAt(i) != strs[j].charAt(i)) {

                    return result;
                }
            }

            result = result + words.charAt(i);
        }

        return result;
    }
}