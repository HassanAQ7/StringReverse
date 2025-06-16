package reverse;

public class StringReverser {

    public String reverseString(String str) {
        if (str.isBlank() && str.isEmpty()) {
            return str;
        }

        StringBuffer buffer = new StringBuffer(str);
        return buffer.reverse().toString();
    }

    public String reverseSentence(String sentence) {
        if (sentence.isBlank() && sentence.isEmpty()) {
            return sentence;
        }

        String[] words = sentence.split(" ");
        StringBuffer reversedSentence = new StringBuffer();
        for (int i = words.length - 1; i >= 0; i--) {
            StringBuffer wordBuffer = new StringBuffer(words[i]);
            reversedSentence.append(wordBuffer.reverse().toString());
            if (i != 0) {
                reversedSentence.append(" ");
            }
        }
        return reversedSentence.toString();
    }

}
