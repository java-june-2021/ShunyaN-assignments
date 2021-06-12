public class StringManipulator {
    public String trimAndConcat(String line1, String line2) {
        return line1.trim().concat(line2.trim());
    }

    public Integer getIndexOrNull(String string, char i) {
        if(string.indexOf(i) == -1){
            return null;
        }
        return string.indexOf(i);
    }
    public Integer getIndexOrNull(String string, String substring) {
        if(string.indexOf(substring) == -1){
            return null;
        }
        return string.indexOf(substring);
    }

    public String concatSubstring(String firstStr, int start, int ending, String replacement){
        String subStr = firstStr.substring(start, ending);
        return subStr.concat(replacement);
    }
}