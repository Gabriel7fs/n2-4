package com.example.demo;

public class N2WordEncryption {
    public static String encryptThis(String message) {
        String[] words = message.split(" ");
        StringBuilder encryptedMessage = new StringBuilder();

        for (String word : words) {
            if (word.length() == 0) {
                encryptedMessage.append(word).append(" ");
            } else {
                int firstCharAscii = (int) word.charAt(0);
                char secondChar = word.length() > 1 ? word.charAt(1) : word.charAt(0);
                char lastChar = word.charAt(word.length() - 1);

                StringBuilder encryptedWord = new StringBuilder();
                encryptedWord.append(firstCharAscii).append(lastChar);

                if (word.length() > 2) {
                    encryptedWord.append(word, 2, word.length() - 1);
                }

                encryptedWord.append(secondChar);

                encryptedMessage.append(encryptedWord.toString()).append(" ");
            }
        }

        return encryptedMessage.toString().trim();
    }
}
