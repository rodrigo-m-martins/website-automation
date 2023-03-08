package org.torc.configuration;

import io.github.cdimascio.dotenv.Dotenv;

public class Environment {

    public static Dotenv properties;

    public static void loadConfig(){
        properties = Dotenv
                .configure()
                .directory("src/main/resources")
                .filename("env")
                .ignoreIfMalformed()
                .ignoreIfMissing()
                .load();
    }
}
