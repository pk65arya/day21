package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public String fnamevalidation() throws Exceptiontest {
        String firstname = "pradeep";
        String valid = "[A-Z]{1}[a-z]{2,}";
    Pattern pattern = Pattern.compile(valid);
    Matcher matcher = pattern.matcher(firstname);
  //  return String.valueOf(matcher.matches());
        if(matcher.matches()){
            return  String.valueOf(matcher.matches());
        }else{
            throw new Exceptiontest("Please check name");
        }
    }



    public String lnamevalidation()throws Exceptiontest{
        String lname="Kumar";
        String valid="[A-Z]{1}[a-z]{2,}";
        Pattern pattern=Pattern.compile(valid);
        Matcher matcher= pattern.matcher(lname);
        if (matcher.matches()){
            return String.valueOf(matcher.matches());
        }else
            throw new Exceptiontest("please check your name");
    }
    public String emailvalidation()throws Exceptiontest{
        String email="abc.xyz@bl.co.in";
        String valid="[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}";
        Pattern pattern=Pattern.compile(valid);
        Matcher matcher= pattern.matcher(email);
        if (matcher.matches()){
            return String.valueOf(matcher.matches());
        }else
            throw new Exceptiontest("please enter a valid Email");
    }
    public String mobilevalidatio() throws Exceptiontest {
        String  mobile="91 6207827848";
        String valid="[0-9]{2}[ ][0-9]{10}";
        Pattern pattern=Pattern.compile(valid);
        Matcher matcher= pattern.matcher(mobile);
        if (matcher.matches()){
            return String.valueOf(matcher.matches());
        }else
            throw new Exceptiontest("please enter a valid Phone number");

    }
}
