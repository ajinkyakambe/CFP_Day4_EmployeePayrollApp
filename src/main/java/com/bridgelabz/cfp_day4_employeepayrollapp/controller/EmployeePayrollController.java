package com.bridgelabz.cfp_day4_employeepayrollapp.controller;

import com.bridgelabz.cfp_day4_employeepayrollapp.dto.EmployeePayrollDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    @RequestMapping(value = {"/","","/get"})
    public ResponseEntity<String> getEmployeePayrollData() {
        return new ResponseEntity<String>("Get call Success", HttpStatus.OK);
    }

    @GetMapping("/get/{empId}")
    public ResponseEntity<String> getEmployeePayrollData(@PathVariable("empId") int empId) {
        return new ResponseEntity<String>("Get call Success for id:"+empId,HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<String> addEmployeePayrollData(@RequestBody EmployeePayrollDTO empPayrollDTO){
        return new ResponseEntity<String>("Created emp payroll Data for "+empPayrollDTO,HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateEmployeePayrollData(@RequestBody EmployeePayrollDTO empPayrollDTO) {
        return new ResponseEntity<String>("Updated emp payroll Data for "+empPayrollDTO,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{empId}")
    public ResponseEntity<String> deleteEmployeePayrollData(@PathVariable("empId") int empId) {
        return new ResponseEntity<String>("Delete call Success for id:" + empId, HttpStatus.OK);
    }

}


/*
Try with rest call where Response entity will return JSON data.

CURL Calls for Testing

• curl localhost:8080/employeepayrollservice/ -w "\n"
• curl localhost:8080/employeepayrollservice/get/1 -w "\n"
• curl -X POST -H "Content-Type: application/json" -d '{"name": "Lisa","salary":
2000}' "http://localhost:8080/employeepayrollservice/create" -w "\n"
• curl -X PUT -H "Content-Type: application/json" -d '{"name": "Lisa","salary": 2000}'
"http://localhost:8080/employeepayrollservice/update" -w "\n"
• curl -X DELETE -H "Content-Type: application/json"
localhost:8080/employeepayrollservice/delete/1 -w "\n"

 */
