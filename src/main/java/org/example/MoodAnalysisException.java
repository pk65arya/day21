package org.example;

public class MoodAnalysisException extends Exception{

    NullMoodErrors error;
    private final String message;

    public MoodAnalysisException(NullMoodErrors error, String message) {
        super(message);
        this.error = error;

       this.message = message;
    }
}
