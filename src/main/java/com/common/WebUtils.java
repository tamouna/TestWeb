/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.common;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author dbu
 */
public class WebUtils {
        
    public static Integer tryParseInteger(String text) 
    {
        try 
        {
            return Integer.parseInt(text);
        } 
        catch (NumberFormatException e) 
        {
            return null;
        }
    }  
    public static Boolean tryParseBoolean(String text) 
    {
        try 
        {
            return Boolean.parseBoolean(text);
        } 
        catch (NumberFormatException e) 
        {
            return null;
        }
    }  
    
    
    public static String getMonthForInt(int inMonth) 
    {
        String month = "invalid";
        DateFormatSymbols dfs = new DateFormatSymbols();
        String[] months = dfs.getMonths();
        
        if (inMonth >= 0 && inMonth <= 11 ) {
            month = months[inMonth];
        }
        return month;
    }
    
    public static LocalDate checkDateFormat(String inDate)
    {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Pattern plus = Pattern.compile("^J\\+([0-9]+)");
        Matcher mPlus = plus.matcher(inDate.replaceAll("\\s", ""));
        if (mPlus.find())
        {
            String days = mPlus.group(1);
            Integer addDays = tryParseInteger(days);
            if (addDays!=null)
            {
                 inDate = LocalDate.now().plusDays(addDays).format(formatter);
                
            }
            else
                return null;
        }
        
        Pattern minus = Pattern.compile("^J-([0-9]+)");
        Matcher mMinus = minus.matcher(inDate.replaceAll("\\s", ""));
        if (mMinus.find())
        {
            String days = mMinus.group(2);
            Integer decDays = tryParseInteger(days);
            if (decDays!=null)
            {
                inDate =  LocalDate.now().minusDays(decDays).format(formatter);
            }
            else
                return null;
        }
        
        try
        {
            return LocalDate.parse(inDate, formatter);
        }
        catch (DateTimeParseException exception)
        {
            return null;
        }
         
    }
    
    public static String[] getDayMonthYearFromDate(LocalDate inDate, Boolean monthInLetters)
    {
        String[] returnedValue = new String[3];
        int day = inDate.getDayOfMonth();
        int year = inDate.getYear();
        returnedValue[0] = String.valueOf(day);
        if (monthInLetters)
        {
            Month month = inDate.getMonth();
            returnedValue[1] = month.name();
        }
        else
        {
            returnedValue[1] = String.valueOf(inDate.getMonthValue());
        }
        returnedValue[2] = String.valueOf(year);
        
        return returnedValue;
    }
    
    public static String[] getMonthYearFromExpirationDate(String expirationDate)
    {
        String[] returnedValue = new String[2];
        if (expirationDate.matches("([0-9]{2})/([0-9]{4})"))
        {
              returnedValue[0] =  expirationDate.substring(0,2);
              returnedValue[1] =  expirationDate.substring(3,7);
              return returnedValue;
        }
        return null;
    }
    
    public static String setEmail(String inEmail, Boolean isToCreate)
    {
        if (isToCreate)
        {
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            return ("user-bbhotel" + String.valueOf(timestamp.getTime()) + "@yopmail.com");
        }
        else
        {
            return inEmail;
        }
    }
}
