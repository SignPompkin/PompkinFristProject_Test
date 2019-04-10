package com.example.itsoftware.accountbookmanagementsystem;

import android.util.Log;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

/**
 * Created by ITSoftware on 3/20/2019.
 */

public class Help {
    //GET
    public static String get(final String data) {
        final String[] string = {null};
                try {
                    URL url = new URL("http://10.0.2.2:5000/api/AccountBookController/" + data);
                    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                    conn.setRequestMethod("POST");
                    conn.getOutputStream();
                    Scanner scanner = new Scanner(conn.getInputStream(), "UTF-8");
                    String result = scanner.useDelimiter("\\A").next();
                    string[0] = result;
                } catch (Exception e) {
                    e.printStackTrace();
                }
        return string[0];
    }

    //POST
    public static void post(final String data) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    URL url = new URL("http://10.0.2.2:5000/api/AccountBookController/" + data);
                    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                    conn.setRequestMethod("POST");
                    InputStream IS = conn.getInputStream();
                    Scanner scanner = new Scanner(IS, "UTF-8");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
