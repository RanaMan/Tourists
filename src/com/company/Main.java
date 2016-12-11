package com.company;

import com.company.com.company.commands.DeleteEmployee;
import com.company.com.company.commands.Exit;
import com.company.com.company.commands.LogTime;
import com.company.com.company.commands.Report;
import com.company.com.company.interfaces.Command;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        try {
            InputStreamReader reader = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(reader);

            PromptingReader prompter = new PromptingReader(bufferedReader);

            Map<String, EmployeeRecord> roster = new HashMap<>();
            Command[] commands = new Command[]{
                new LogTime(prompter, roster),
                new Report(prompter, roster),
                new DeleteEmployee(prompter, roster),
                new Exit(),
            };

            while (true) {
                Command command = prompter.selectValue("Choose a command: ", commands);
                if(command.performCommand() == false){
                    break;
                }
            }

        }catch(IOException e){
            System.out.println("Input Error: " + e);
        }

	}

    private static void processEmployee(PromptingReader prompter, HashMap<String, EmployeeRecord> roster) throws IOException {

    }
}
