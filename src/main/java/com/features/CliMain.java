package com.features;

import java.util.Properties;

public class CliMain {

    public static void main(String[] args) {
        Properties props = new Cli(args).parse();
        System.setProperties(props);

        System.out.println(System.getProperty("BUCKET_NAME"));
    }

}
