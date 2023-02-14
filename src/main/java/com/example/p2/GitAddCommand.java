package com.example.p2;

import org.springframework.stereotype.Component;
import picocli.CommandLine;

import java.nio.file.Path;
import java.util.List;

@CommandLine.Command(
        name = "add"
)
@Component
public class GitAddCommand implements Runnable {
    @CommandLine.Option(names = {"-A", "--all"})
    private boolean allFiles;

    @CommandLine.Parameters
    private List<Path> files;

    @Override
    public void run() {
        if (allFiles) {
            System.out.println("Adding all files to the staging area");
        }

        if (files != null) {
            files.forEach(path -> System.out.println("Adding " + path + " to the staging area"));
        }
    }
}
