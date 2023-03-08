package org.torc;

public class Main {
    public static void main(String[] args) {
        Environment.loadConfig();
        System.out.println(Environment.properties.get("URL"));

    }
}