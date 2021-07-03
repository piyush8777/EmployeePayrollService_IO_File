/**
 * ***************************************************** 
 * Purpose: to store Employee Payroll into a File
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
	 public enum IOService{CONSOLE_IO,FILE_IO,DB_IO,REST_IO}
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
	        employeePayrollService.writeEmployeePayRollData(IOService.CONSOLE_IO);
	    }

	    private void readEmployeePayRollData(Scanner consoleInputReadr){
	        System.out.println("Enter Employee Id");
	        int id = consoleInputReadr.nextInt();
	        System.out.println("Enter Employee Name");
	        String name =consoleInputReadr.next();
	        System.out.println("Enter Employee Salary");
	        double salary = consoleInputReadr.nextDouble();

	    }
	    
	    /**
	     * Method for writing employee payroll data into console.
	     */

	    public void writeEmployeePayRollData(EmployeePayrollService.IOService ioService){
	        if(ioService.equals(IOService.CONSOLE_IO))
	            System.out.println("\nWriting Employee Payroll Roaster to console\n"+ employeePayrollList);
	        else if(ioService.equals(IOService.FILE_IO))
	            new EmployeePayrollFileIOService().writeData(employeePayrollList);

	    }
	    public void printData(IOService ioService) {
	        if(ioService.equals(IOService.FILE_IO))
	            new EmployeePayrollFileIOService().printData();

	    }

	    public long countEntries(IOService ioService) {
	        if(ioService.equals(IOService.FILE_IO))
	            return new EmployeePayrollFileIOService().countEntries();
	        return 0;
	    }

}
