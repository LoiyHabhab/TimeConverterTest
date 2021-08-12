package com.citi.training;

import com.citi.ss.TimeToTextConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeToTextConverterTest {

    private TimeToTextConverter timeToTextConverter;
    private Random random;
    private int randomHour;

    @BeforeEach
    public void setup(){
        timeToTextConverter = new TimeToTextConverter();
        random = new Random();
        randomHour = 1 + random.nextInt(23);
    }

    public String getTimeString(int minutes){
        return timeToTextConverter.convertTimeToText(LocalTime.MIDNIGHT.plusMinutes(minutes).plusHours(randomHour));
    }

    @Test
    public void canDoMidnight(){
        String timeAsText = timeToTextConverter.convertTimeToText(LocalTime.MIDNIGHT);
        assertEquals("midnight",timeAsText);
    }

    @Test
    public void canDoOnTheHour(){
        String timeAsText = timeToTextConverter.convertTimeToText(LocalTime.MIDNIGHT.plusHours(randomHour));
        assertEquals("on the hour",timeAsText);
    }

    @Test
    public void canDoHalfPastTheHour(){
        assertEquals("half past the hour",getTimeString(30));
    }

    @Test
    public void canDoQuarterPastTheHour(){
        assertEquals("quarter past the hour",getTimeString(15));
    }

    @Test
    public void canDoQuarterToTheHour(){
        assertEquals("quarter to the hour",getTimeString(45));
    }

    @Test
    public void canDoFiveMinutesPast(){
        assertEquals("five minutes past",getTimeString(5));
    }

    @Test
    public void canDoTenMinutesPast(){
        assertEquals("ten minutes past",getTimeString(10));
    }

    @Test
    public void canDoJustAfterTheHour(){
        assertEquals("just after the hour",getTimeString(1+random.nextInt(3)));
    }

    @Test
    public void canDoAlmostTheHour(){
        assertEquals("almost the hour",getTimeString(57+random.nextInt(3)));
    }

}
