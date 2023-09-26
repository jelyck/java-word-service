package io.jelyck.javawordservice.word;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WordController {

    @Autowired
    WordService service;

    @GetMapping("/palindrome")
    Boolean isPalindrome(@RequestParam String word) {
        return service.isPalindrome(word);
    }

    @PostMapping(value = "/anagram", consumes = "application/json")
    Boolean isAnagram(@RequestBody Word word) {
        return service.isAnagram(word.getWord1(), word.getWord2());
    }

}