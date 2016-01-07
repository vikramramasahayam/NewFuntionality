package com.features;

import java.util.Properties;

import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

public class Cli {

    private String[] args = null;
    private Options options = new Options();

    public Cli(String[] args) {
        this.args = args;
        options.addOption("b", "Bucket Name", true, "Pass the s3 bucket Name");

    }

    public Properties parse() {
        CommandLineParser parser = new BasicParser();
        Properties prop = new Properties();

        CommandLine cmd = null;
        try {
            cmd = parser.parse(options, args);
            if (cmd.hasOption("h")) {
                help();
            }

            if (cmd.hasOption("b")) {
                prop.setProperty("BUCKET_NAME", cmd.getOptionValue("b"));
            } else {
                System.out.println("Missing b option");
                help();
            }

        } catch (ParseException e) {
            System.out.println("Failed to parse comand line properties" + e);
            help();

        }

        return prop;
    }

    private void help() {
        HelpFormatter formater = new HelpFormatter();
        formater.printHelp("Main", options);
        System.exit(0);

    }

}
