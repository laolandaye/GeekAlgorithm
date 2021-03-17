public class Solution {

    public boolean isPalindrome(String s) {
        // 高层次，主干逻辑为主

        //1.filter out number & char
        String filteredS = _filterNonNumberAndChar(s);
        //2. reverse and compare
        String reversedS = _reverseString(filteredS);

        return reversedS.equalsIgnoreCase(filteredS);
    }

    private String _reverseString(String s) {
        return new StringBuilder(s).reverse().toString() ;
    }
    private String _filterNonNumberAndChar(String s) {
        return s.replaceAll("[^A-Za-z0-9]","");
    }

    /**
     * 自上而下编程法
     *   1.先拆分主干逻辑，分点
     *   2.每个点值写出方法名
     *   3.先主干逻辑流程跑通，在完善每个点
     **/
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(s.isPalindrome("race a car"));
    }
}
