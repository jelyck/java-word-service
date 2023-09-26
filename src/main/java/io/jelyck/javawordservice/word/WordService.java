package io.jelyck.javawordservice.word;

import java.util.Arrays;

import org.springframework.stereotype.Service;

@Service
public class WordService {

    protected Boolean isPalindrome(String word) {
        String clean = word.trim().toLowerCase();
        StringBuilder plain = new StringBuilder(clean);
        StringBuilder reverse = plain.reverse();
        return (reverse.toString()).equals(clean);
    }

    protected Boolean isAnagram(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        char[] a1 = word1.toCharArray();
        char[] a2 = word2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1, a2);
    }

}