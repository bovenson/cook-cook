package pub.wii.cook.java.test;

import com.google.gson.Gson;

public class TestA {
    public static void main(String[] args) {
        String hello = "Hello World";
        // System.out.println(hello.substring(0, hello.lastIndexOf("Wrld")));

        // Number number = Double.NaN;
        // System.out.println(number);
        // String s = "HELLO";
        // System.out.println(String.valueOf(s));
        // System.out.println(s.toString());
        //
        // System.out.println("20200811-abc".compareTo("20200711-de"));

        System.out.println(new Gson().toJson("AB:C".split(":")));
    }
}
