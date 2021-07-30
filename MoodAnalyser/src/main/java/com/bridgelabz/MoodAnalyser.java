package com.bridgelabz;

public class MoodAnalyser {

    /**
     * Purpose : Given a message, ability to analyse and respond HAPPY or SAD mood
     *
     * @param : message
     * @return : HAPPY or SAD
     */
    public String analyseMood(String message) {
        if (message.contains("sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}
