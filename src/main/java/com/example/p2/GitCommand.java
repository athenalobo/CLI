package com.example.p2;

import org.springframework.stereotype.Component;
import picocli.CommandLine;

@CommandLine.Command(
        subcommands = {
                GitAddCommand.class,
                GitCommitCommand.class
        }
)
@Component
public class GitCommand implements Runnable {
    public static void main(String[] args) {
        //CommandLine.run(new GitCommand(), args);
        CommandLine commandLine = new CommandLine(new GitCommand());
        commandLine.registerConverter(ConfigElement.class, ConfigElement::from);
        commandLine.parseWithHandler(new CommandLine.RunLast(), args);
    }

    @Override
    public void run() {
        System.out.println("The popular git command");
    }
}