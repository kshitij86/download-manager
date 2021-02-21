package com.dmj.app;


public class CommandDelegator {
    private String option = "";

    protected void parseCommand(String command) {
        this.option = command;
        switch (command) {
            case "what":
                System.out.println(GlobalConstants.WELCOME_MESSAGE);
                break;
            case "help":
                for (String optStr : GlobalConstants.OPTIONS_DESCRIPTIONS) {
                    System.out.println(optStr);
                }
                break;
            case "download":
                break;
            default:
                System.out.println();
        }
    }

}
