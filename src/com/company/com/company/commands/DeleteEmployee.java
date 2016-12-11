package com.company.com.company.commands;

import com.company.EmployeeRecord;
import com.company.PromptingReader;
import com.company.com.company.interfaces.Command;
import com.company.com.company.interfaces.Description;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by rana_ on 12/11/2016.
 */
public class DeleteEmployee implements Command, Description {

    private final Map<String, EmployeeRecord> roster;
    private final PromptingReader prompter;

    public DeleteEmployee(  PromptingReader prompter,
                            Map<String, EmployeeRecord> roster ){
        this.roster = roster;
        this.prompter = prompter;


    }
    @Override
    public String getDescription() {
        return "Delete an Employee";
    }

    @Override
    public boolean performCommand() throws IOException {

        String firstName = prompter.readString("First Name:");
        String lastName = prompter.readString("Last Name:");
        String fullName = firstName + " " + lastName;

        if(roster.remove(fullName) != null){
            System.out.println("OK, [" + fullName +"] has been removed!");
        }else{
            System.out.println("Sorry, but [" + fullName +"] is in our system");
        }

        return false;
    }
}
