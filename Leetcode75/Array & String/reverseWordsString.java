class Solution {
    public String reverseWords(String s) {
        StringBuilder reversedString = new StringBuilder();
        StringBuilder word = new StringBuilder();

        boolean insideWord = false;

        // Iterate through the characters in the input string
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);

            // Check if the current character is not a space
            if (c != ' ') {
                word.insert(0, c); // Prepend the character to the word
                insideWord = true;
            } else if (insideWord) {
                reversedString.append(word).append(' '); // Append the word to the reversed string
                word.setLength(0); // Clear the word buffer
                insideWord = false;
            }
        }

        // Append the last word (if any) to the reversed string
        if (insideWord) {
            reversedString.append(word);
        }

        // Remove trailing spaces and return the reversed string
        return reversedString.toString().trim();
    }
}
