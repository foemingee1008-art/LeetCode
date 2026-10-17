package Q28;

public class Q28_sol {
    public int strStr(String haystack, String needle) {
        char[] haystackArr = haystack.toCharArray();
        char[] needleArr = needle.toCharArray();
        if (needleArr.length > haystackArr.length){
            return -1;
        }
        for (int start = 0; start <= haystackArr.length - needleArr.length; start++){
            int slow = 0;
            while (slow < needleArr.length){
                if (haystackArr[slow + start] != needleArr[slow]){
                    break;
                }
                slow++;
            }
            if (slow == needleArr.length){
                return start;
            }
        }
        return -1;
    }
}
