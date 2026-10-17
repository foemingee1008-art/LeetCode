package Q14;

public class Q14_sol {
    public String longestCommonPrefix(String[] strs) {
        String commonPrefix = strs[0];
        int i = 1;
        while (i < strs.length){
            if (strs[i].indexOf(commonPrefix) != 0){
                commonPrefix = commonPrefix.substring(0, commonPrefix.length() - 1);
                if (commonPrefix.isEmpty())
                    return "";
            }
            else{
                i++;
            }
        }
        return commonPrefix;
    }
}
