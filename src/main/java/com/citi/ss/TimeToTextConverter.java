package com.citi.ss;

import java.time.LocalTime;

public class TimeToTextConverter {
    public String convertTimeToText(LocalTime localTime) {
        if(localTime.getHour()==0 && localTime.getMinute()==0){
            return "midnight";
        }
        else if(localTime.getMinute()==0) {
            return "on the hour";
        }
        else if(localTime.getMinute()==30){
            return "half past the hour";
        }
        else if(localTime.getMinute()==15){
            return "quarter past the hour";
        }
        else if(localTime.getMinute()==45){
            return "quarter to the hour";
        }
        else if(localTime.getMinute()==5){
            return "five minutes past";
        }
        else if(localTime.getMinute()==10){
            return "ten minutes past";
        }
        else if(localTime.getMinute()<=3){
            return "just after the hour";
        }
        else if(localTime.getMinute()>=57){
            return "almost the hour";
        }
        else{
            return null;
        }
    }
}
