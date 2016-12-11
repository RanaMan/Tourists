package com.company.com.company.commands;

import com.company.EmployeeRecord;
import com.company.PromptingReader;
import com.company.com.company.interfaces.Command;
import com.company.com.company.interfaces.Description;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

/**
 * Created by rana_ on 12/11/2016.
 */
public class Report implements Command, Description {

    private final Map<String, EmployeeRecord> roster;
    private final PromptingReader prompter;

    public Report(PromptingReader prompter,
                   Map<String, EmployeeRecord> roster ){
        this.roster = roster;
        this.prompter = prompter;
    }

    @Override
    public String getDescription() {
        return "Hourly Report";
    }

    @Override
    public boolean performCommand() throws IOException {
        //Walk through the roster, and determine how many hours they have entered.

        for (EmployeeRecord employeeRecord : roster.values()) {
             System.out.println("Name ["+employeeRecord.getFullName()+"] who has worked a total of [" + employeeRecord.getTotalHoursWorked() + "]") ;
        }
        return true;
    }
}
