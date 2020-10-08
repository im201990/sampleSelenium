package utils;/*
 *
 * created by himanshu on 08/10/20
 *
 */

import org.testng.Reporter;

import java.text.SimpleDateFormat;

public class LoggerUtils extends UtilClass{

    private LoggerUtils() {

    }

    public static void info(String text) {
        java.util.Date date = new java.util.Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy hh:mm:ss SSS");
        String timestamp = sdf.format(date);
        text = String.format("INFO: [%s] %s", timestamp, text);
        System.out.println("----> " + text);
        utilList.add(text);
        Reporter.log(String.format("<div style=\"color:green\">%s</div>", text), false);
    }

    public static void debug(String text) {
        java.util.Date date = new java.util.Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy hh:mm:ss SSS");
        String timestamp = sdf.format(date);
        text = String.format("DEBUG: [%s] %s", timestamp, text);
        System.out.println("----> " + text);
        utilList.add(text);
        Reporter.log(String.format("<div>%s</div>", text), false);
    }

    public static void warning(String text) {
        java.util.Date date = new java.util.Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy hh:mm:ss SSS");
        String timestamp = sdf.format(date);
        text = String.format("WARNING: [%s] %s", timestamp, text);
        System.out.println("----> " + text);
        utilList.add(text);
        Reporter.log(String.format("<div style=\"background-color:yellow\">%s</div>", text), false);
    }

    public static void error(String text) {
        java.util.Date date = new java.util.Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy hh:mm:ss SSS");
        String timestamp = sdf.format(date);
        text = String.format("ERROR: [%s] %s", timestamp, text);
        System.out.println("!---- " + text);
        utilList.add(text);
        Reporter.log(String.format("<div style=\"background-color:red; color:white\">%s</div>", text), false);
    }
}
