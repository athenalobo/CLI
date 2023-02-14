package com.example.p2;

import org.springframework.stereotype.Component;
import picocli.CommandLine;
@Component
public class GitConfigCommand
{
    @CommandLine.Parameters(index = "0")
    private ConfigElement element;

    @CommandLine.Parameters(index = "1")
    private String value;

    //@Override
    public void run() {
        System.out.println("Setting " + element.value() + " to " + value);
    }
}
