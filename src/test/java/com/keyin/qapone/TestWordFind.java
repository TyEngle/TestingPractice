package com.keyin.qapone;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestWordFind {
//tests need to be void
    @Test
    public void is_word_in_sequence_true(){
        WordFind newWordFind = new WordFind();
        Assertions.assertTrue(newWordFind.findAndGrabWordFromSequence(
                "word", "find_word_from_this"));
        System.out.println("Test run successfully with word found in sequence");

    }

    @Test
    public void is_word_in_sequence_false(){
        WordFind newWordFind = new WordFind();
        Assertions.assertFalse(newWordFind.findAndGrabWordFromSequence(
                "spaghetti", "find_word_from_this"));
        System.out.println("Test run successfully with word not found in sequence");
    }

    @Test
    public void does_word_in_sequence_equal_true() {

        WordFind newWordFind = new WordFind();
        Assertions.assertEquals(true, newWordFind.findAndGrabWordFromSequence(
                "applebees", "come_eat_at_applebees"));
        System.out.println("Test run successfully with desired boolean result of ");

    }




}
