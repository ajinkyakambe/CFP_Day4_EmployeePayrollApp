package com.bridgelabz.cfp_day4_employeepayrollapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/* UC 1
Create a Employee Payroll Spring
Project to cater to REST Request from
Employee Payroll UI

- Here we will reuse the Employee Payroll Frontend UI
we have already developed
- Instead of making REST call to JSONServer will now
make server calls to Employee Payroll Spring App
- Also test the REST API using CURL Commands
 */


@SpringBootApplication
public class CfpDay4EmployeePayrollAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(CfpDay4EmployeePayrollAppApplication.class, args);
    }

}
