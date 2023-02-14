package com.example.p2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class P2Application implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(P2Application.class, args);
    }

    @Override
    public void run(String... args) {
    }

    private GitCommand gitCommand;
    private GitAddCommand addCommand;
    private GitCommitCommand commitCommand;
    private GitConfigCommand configCommand;

    public P2Application(GitCommand gitCommand, GitAddCommand addCommand,
                       GitCommitCommand commitCommand, GitConfigCommand configCommand) {
        this.gitCommand = gitCommand;
        this.addCommand = addCommand;
        this.commitCommand = commitCommand;
        this.configCommand = configCommand;
    }
}
