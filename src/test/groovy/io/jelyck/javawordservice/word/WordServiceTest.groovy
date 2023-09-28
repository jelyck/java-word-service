package io.jelyck.javawordservice.word;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ContextConfiguration

import spock.lang.Specification

@SpringBootTest
@ContextConfiguration
class WordServiceTest extends Specification {

    @Autowired
    private WordService service

    def "isAnagram should return true for anagrams"() {
        expect:
        service.isAnagram(word1, word2)

        where:
        word1    | word2
        "act"    | "cat"
        "ape"    | "pea"
        "meat"   | "team"
    }

    def "isAnagram should return false for non anagrams"() {
        expect:
        !service.isAnagram(word1, word2)

        where:
        word1    | word2
        "jens"   | "best"
        "jens"   | "kung"
        "jens"   | "star"
    }

    def "isPalindrome should return true for palindromes"() {
        expect:
        service.isPalindrome(word)

        where:
        word << ["kayak", "peep", "wow"]
    }

    def "isPalindrome should return false for non palindromes"() {
        expect:
        !service.isPalindrome(word)

        where:
        word << ["jens", "best", "kung"]
    }

}