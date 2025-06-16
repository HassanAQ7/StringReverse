package reverse;

public class StringReverser {

    public static String reverseString(String str) {
        if (str.isBlank()) {
            return str;
        }

        StringBuffer buffer = new StringBuffer(str);
        return buffer.reverse().toString();
    }

    
}
