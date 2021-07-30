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
     *
     * @return : HAPPY or SAD
     */
    public String analyseMood() {
        if (message.contains("sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}