package com.bridgelabz;

public class MoodAnalyser {

    private String message;

    //Default Constructor
    public MoodAnalyser() {
    }

    //Parameterized Constructor
    public MoodAnalyser(String message) {
        this.message = message;
    }

    /**
     * Purpose : Given a message, ability to analyse and respond HAPPY or SAD mood.
     * Condition 1 : Handle NULLPOINTER Exception using try-catch block.
     * Condition 2 : Mood analysis exception for null or empty message.
     */
    public String analyseMood() throws MoodAnalysisException {
        try {
            if (message.length() == 0)
                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY, "Please enter proper message!");
            if (message.contains("sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch (NullPointerException e) {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL, "Please enter proper message!");
        }
    }
}
