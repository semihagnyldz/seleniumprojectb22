package com.cybertek.utilities;

public class BrowserUtils {
    public static void sleep(int second){
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
