package com.bridgelabz;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MoodTest {
    /**
     * Purpose : analyse mood
     * Input message : This is a sad message.
     *
     * @return : SAD
     */
    @Test
    public void testMoodAnalysis_whenMoodIsSad() {
        MoodAnalyser moodAnalyzer = new MoodAnalyser();
        String mood = moodAnalyzer.analyseMood("This is a sad message");
        Assert.assertThat(mood, CoreMatchers.is("SAD"));
    }

    /**
     * Purpose : analyse mood
     * Input message: Im in any mood.
     *
     * @return : HAPPY
     */
    @Test
    public void testMoodAnalysis_whenMoodIsHappy() {
        MoodAnalyser moodAnalyzer = new MoodAnalyser();
        String mood = moodAnalyzer.analyseMood("Im in any mood");
        Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
    }
}
