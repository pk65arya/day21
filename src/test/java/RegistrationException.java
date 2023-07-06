import org.example.Exceptiontest;
import org.example.UserRegistration;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegistrationException {
    UserRegistration val=new UserRegistration();

    @Test
    public void testfnamevalidation()  throws Exceptiontest{
        String bool;

            bool = val.fnamevalidation();
            assertEquals(true, bool);


    }

    @Test
    public void testlnamevalidation()throws Exceptiontest{
        String bool= val.lnamevalidation();
        assertEquals(true, bool);
    }

    @Test
    public void testemailvalidatin()throws Exceptiontest{
        String bool= val.emailvalidation();
        assertEquals(true, bool);
    }
    @Test
    public void testmobilevalidation()throws Exceptiontest{
        String bool= val.mobilevalidatio();
        assertEquals(true, bool);
    }
}
