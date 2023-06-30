package day24_dateAndTime;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class JavaDateAndTimeResult {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */


    public static void main(String[] args) {
        findDay(8, 5, 2015);
    }


    public static String findDay(int month, int day, int year) {

        LocalDate date = LocalDate.of(year, month, day);
        String nap = date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault()).toUpperCase();
        return nap;
    }


}
