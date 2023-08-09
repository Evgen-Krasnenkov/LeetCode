package com.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsInStringTest {
    @Test
    public void givenString_whenRevers_thenOk(){
        ReverseWordsInString reverseWordsInString = new ReverseWordsInString();
        String words = reverseWordsInString.reverseWordsInString(" the sky   is blue ");
        Assertions.assertEquals("eht yks si eulb", words);
    }

    @Test
    public void givenString_whenReversWordOrder_thenOk(){
        ReverseWordsInString reverseWordsInString = new ReverseWordsInString();
        String words = reverseWordsInString.reverseWordsStream(" the sky   is blue ");
        Assertions.assertEquals("blue is sky the", words);
    }

    @Test
    public void givenString_whenReversWordOrder_thenStringBuilderOk(){
        ReverseWordsInString reverseWordsInString = new ReverseWordsInString();
        String words = reverseWordsInString.reverseWords(" the sky   is blue ");
        Assertions.assertEquals("blue is sky the", words);
    }

}
