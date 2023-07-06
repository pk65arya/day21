package org.example;

public class MoodAnalyzer {
    String message;
    private Object MoodAnalysisException;

    //Constructor created to pass message as mentioned in UC.
    public MoodAnalyzer(String message) {

        this.message = message;
    }

    //Function to Check Mood of a String Entered
    public String moodCheck()throws MoodAnalysisException, Exception {


            //Created Try and Catch Blocks to Handle Exceptions if Occurs.
            try {
                if (message.contains("SAD")) {
                    return "SAD";
                } else if (message.contains("HAPPY")) {
                    return "HAPPY";
                } else if (message.contains("")) {
                    throw new MoodAnalysisException(NullMoodErrors.EMPTYMOOD, "Entered Nothing !!");
                } else {
                    return "HAPPY";
                }
            }
            //Don't Know what would be exception, So Took a Normal Exception to Catch, Whatever Exception Occurs.
            catch (Exception exception) {
                return "HAPPY";
                //1.Don't Know what would be exception, So Took a Normal Exception to Catch, Whatever Exception Occurs.
                //2.Refactored and Handling by Custom Exception
            }

    }
        }


