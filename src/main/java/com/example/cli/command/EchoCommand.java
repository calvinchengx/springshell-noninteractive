package com.example.cli.command;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class EchoCommand {

    @ShellMethod("Displays greeting")
    public String echo(@ShellOption({"-N", "--name"}) String name) {
        return String.format("Hello %s", name);
    }

}