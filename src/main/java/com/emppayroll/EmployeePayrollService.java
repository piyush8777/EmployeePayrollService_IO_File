/**
 * ***************************************************** 
 * Purpose: To watch particular directory along with all
 *             Files and Sub Directories
 *                       
 * @author Piyush Shaw
 * @version 1.0
 * @since 28-06-2021
 * ******************************************************
 */

package com.emppayroll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
	 private List<EmployeePayrollData> employeePayrollList;

	    public EmployeePayrollService(List<EmployeePayrollData>employeePayrollList){
	        this.employeePayrollList = employeePayrollList;
	    }
	    
	    /**
	     * Main Method or Starting point of this program.
	     *
	     * @param args
	     */

	    public static void main(String[] args){
	        ArrayList<EmployeePayrollData> employeePayrollList = new ArrayList<>();
	        EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollList);
	        Scanner consoleInputReader = new Scanner(System.in);
	        employeePayrollService.readEmployeePayRollData(consoleInputReader);
	        employeePayrollService.writeEmployeePayRollData();
	    }
	    
	    /**
	     * Method for writing employee payroll data into console.
	     */
	    private void writeEmployeePayRollData(){
	        System.out.println(employeePayrollList);
	    }

	    private void readEmployeePayRollData(Scanner consoleInputReadr){
	    System.out.println("Enter Employee Id:");
	    int id = consoleInputReadr.nextInt();
	    System.out.println("Enter Employee Name:");
	    String name =consoleInputReadr.next();
	    System.out.println("Enter Employee Salary:");
	    double salary = consoleInputReadr.nextDouble();

	    }


}
