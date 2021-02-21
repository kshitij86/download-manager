package com.dmj.app;

/**
 * Download files from the internet
 *
 */
public class App {
    public static void main(String[] args) {
        String runArgument = args[0].toString();
        CommandDelegator commandDelegator = new CommandDelegator();
        commandDelegator.parseCommand(runArgument);
    }
}
