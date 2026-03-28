class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase().replaceAll("[^a-z0-9]","");
        String s1=new StringBuilder(s).reverse().toString();
        return s.equals(s1);
    }
}