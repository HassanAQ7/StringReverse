package reverse;

public class StringReverser {

    public static String reverseString(String str) {
        if (str.isBlank() && str.isEmpty()) {
            return str;
        }

        StringBuffer buffer = new StringBuffer(str);
        return buffer.reverse().toString();
    }

    public static String reverseSentence(String sentence) {
        if (sentence.isBlank() && sentence.isEmpty()) {
            return sentence;
        }

        String[] words = sentence.split(" ");
        StringBuffer reversedSentence = new StringBuffer();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]);
            if (i != 0) {
                reversedSentence.append(" ");
            }
        }
        return reversedSentence.toString();
    }

}
