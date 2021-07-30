package com.bridgelabz;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    /**
     * Purpose : analyse mood
     * Input message : This is a sad message.
     * @return : SAD
     */
    @Test
    public void testMoodAnalysis_whenMoodIsSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("This is a sad message");
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood();
            Assert.assertEquals("SAD" , mood);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }

    /**
     * Purpose : analyse mood
     * Input message: Iam in any mood.
     * @return : HAPPY
     */
    @Test
    public void testMoodAnalysis_whenMoodIsHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("Iam in any mood");
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood();
            Assert.assertEquals("HAPPY" , mood);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }

    /**
     * Purpose : Custom Exception if User Provides Invalid Mood
     * Input message: null
     * @return : custom exception message is null
     */

    @Test
    public void testMoodAnalysis_whenMoodIsNull_ShouldThrowException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        try {
            moodAnalyser.analyseMood();
        } catch (MoodAnalysisException e) {
            Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL, e.type);
        }
    }

    /**
     * Purpose : Custom Exception if User Provides Invalid Mood
     * Input message: empty
     * @return : custom exception message is empty
     */

    @Test
    public void testMoodAnalysis_whenMoodIsEmpty_ShouldThrowException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("");
        try {
            moodAnalyser.analyseMood();
        } catch (MoodAnalysisException e) {
            Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_EMPTY , e.type);
        }
    }

}
