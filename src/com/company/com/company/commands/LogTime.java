package com.company.com.company.commands;

import com.company.EmployeeRecord;
import com.company.PromptingReader;
import com.company.com.company.interfaces.Command;
import com.company.com.company.interfaces.Description;

import java.io.IOException;
import java.util.Map;

/**
 * Created by rana_ on 12/11/2016.
 */
public class LogTime implements Command, Description{

    private final Map<String, EmployeeRecord> roster;
    private final PromptingReader prompter;

    public LogTime(PromptingReader prompter,
                   Map<String, EmployeeRecord> roster ){
        this.roster = roster;
        this.prompter = prompter;
    }

    @Override
    public boolean performCommand() throws IOException {
        EmployeeRecord record = prompter.readEmployee(roster);

        int hoursWorked = prompter.readNumber("How many hours did you work today?");
        float pay = hoursWorked * record.getHourlyRateDollars();

        System.out.println(record.getFullName() + " will be paid " + pay + " dollars today!");

        record.addHoursWorked(hoursWorked);
        int daysWorked = record.getDaysWorked();

        int totalHoursWorked = record.getTotalHoursWorked();
        float avgHoursWorked = totalHoursWorked/(float)daysWorked;

        System.out.println("They have worked [" + daysWorked +"] days so far.");
        System.out.println(" "+totalHoursWorked+ " total hours worked, average: " + avgHoursWorked + " hours / day ");

        return true;
    }


    @Override
    public String getDescription() {
        return "Log Time for an employee";
    }
}
