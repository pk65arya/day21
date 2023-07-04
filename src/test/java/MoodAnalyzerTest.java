import org.example.MoodAnalysisException;
import org.example.MoodAnalyzer;
import org.example.NullMoodErrors;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    //Test Case To Check If Message contains SAD
    @Test
   // public void if_MessageWasSad_ShouldReturnSad() {
        public void if_MessageWasSad_ShouldReturnSad () throws MoodAnalysisException {
            MoodAnalyzer moodAnalyze = new MoodAnalyzer("This is SAD message");
        String result1 = null;
        try {
            result1 = moodAnalyze.moodCheck();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Assert.assertEquals("SAD", result1);
        }
  //  }
        //Test Case To Check If Message contains HAPPY
        @Test
    //    public void if_MessageWasHappy_ShouldReturnHappy () {
            public void if_MessageWasHappy_ShouldReturnHappy () throws Exception {
                MoodAnalyzer moodAnalyze = new MoodAnalyzer("This is HAPPY message");
                String result2 = moodAnalyze.moodCheck();
                Assert.assertEquals("HAPPY", result2);
            }
    //    }
            //Test Case To Check If Message was Null
            @Test
      //      public void ifMessageWasNULL_ShouldReturnHappy () {
                public void ifMessageWasNULL_ShouldReturnHappy () throws Exception {
                    MoodAnalyzer moodAnalyze = new MoodAnalyzer(null);
                    String result3 = moodAnalyze.moodCheck();
                    Assert.assertEquals("HAPPY", result3);
                    Assert.assertEquals(NullMoodErrors.EMPTYMOOD, result3);

                }
         //   }
                //Test Case To check if Message was Empty
                @Test
                public void ifMessageWasEMPTY_ShouldReturnHappy () throws Exception {
                    MoodAnalyzer moodAnalyze = new MoodAnalyzer("");
                    String result4 = moodAnalyze.moodCheck();
                    Assert.assertEquals(NullMoodErrors.NULLMOOD, result4);
                }

            }


