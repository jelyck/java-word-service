package io.jelyck.javawordservice.word;

import io.jelyck.javawordservice.word.Word;

import spock.lang.Specification

class WordTest extends Specification {

    def "GIVEN a Word with two words, WHEN accessing word1, THEN the word1 should be returned"() {
        given:
        def word = new Word(word1: "apa", word2: "banan")

        when:
        def word1 = word.word1

        then:
        word1 == "apa"
    }

    def "GIVEN a Word with two words, WHEN accessing word2, THEN the word2 should be returned"() {
        given:
        def word = new Word(word1: "apa", word2: "banan")

        when:
        def word2 = word.word2

        then:
        word2 == "banan"
    }

    def "GIVEN a Word with two different words, WHEN accessing the words, THEN the words should differ"() {
        when:
        def word = new Word(word1: "apa", word2: "banan")

        then:
        word.word1 != word.word2
    }
}