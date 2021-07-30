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
     * Condition: Handle nullpointerException using try-catch block.
     *  @param : message
     * @param this_is_a_sad_message
     * @return : HAPPY or SAD
     */
    public String analyseMood(String this_is_a_sad_message) {
        try {
            if (message.contains("sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch (Exception e) {
            return "HAPPY";
        }
    }
}
