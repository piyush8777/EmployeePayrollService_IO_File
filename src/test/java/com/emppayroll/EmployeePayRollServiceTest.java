package com.emppayroll;

import java.util.Arrays;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class EmployeePayRollServiceTest {
	 @Test
	    public void given3Employees_WhenWrittenToFile_ShouldMatchEmployeeEntries(){
	        EmployeePayrollData[] arrayOfEmps = {
	                new EmployeePayrollData(1,"Jeff Bezos",100000.0),
	                new EmployeePayrollData(2,"Bill Gates",200000.0),
	                new EmployeePayrollData(3,"Mark Zuckerberg",300000.0)
	        };
	        EmployeePayrollService employeePayrollService;
	        employeePayrollService = new EmployeePayrollService(Arrays.asList(arrayOfEmps));
	        employeePayrollService.writeEmployeePayRollData(EmployeePayrollService.IOService.FILE_IO);
	        long entries = employeePayrollService.countEntries(EmployeePayrollService.IOService.FILE_IO);
	        Assertions.assertEquals(3,entries);
	    }
	    @Test
	    public void given3Employees_WhenWrittenToFile_ShouldPrintEmployeeEntries(){
	        EmployeePayrollData[] arrayOfEmps = {
	                new EmployeePayrollData(1,"Jeff Bezos",100000.0),
	                new EmployeePayrollData(2,"Bill Gates",200000.0),
	                new EmployeePayrollData(3,"Mark Zuckerberg",300000.0)
	        };
	        EmployeePayrollService employeePayrollService;
	        employeePayrollService = new EmployeePayrollService(Arrays.asList(arrayOfEmps));
	        employeePayrollService.writeEmployeePayRollData(EmployeePayrollService.IOService.FILE_IO);
	        employeePayrollService.printData(EmployeePayrollService.IOService.FILE_IO);
	        long entries = employeePayrollService.countEntries(EmployeePayrollService.IOService.FILE_IO);
	        Assertions.assertEquals(3,entries);
	    }

	    @Test
	    public void given3Employees_WhenWrittenToFile_ShouldReturnNumberOfFileEntries(){
	        EmployeePayrollData[] arrayOfEmps = {
	                new EmployeePayrollData(1,"Jeff Bezos",100000.0),
	                new EmployeePayrollData(2,"Bill Gates",200000.0),
	                new EmployeePayrollData(3,"Mark Zuckerberg",300000.0),
	                new EmployeePayrollData(4,"Larry Page",120000.0),
	                new EmployeePayrollData(5,"Elon Musk",500000.0)
	        };
	        EmployeePayrollService employeePayrollService;
	        employeePayrollService = new EmployeePayrollService(Arrays.asList(arrayOfEmps));
	        employeePayrollService.writeEmployeePayRollData(EmployeePayrollService.IOService.FILE_IO);
	        employeePayrollService.printData(EmployeePayrollService.IOService.FILE_IO);
	        long entries = employeePayrollService.countEntries(EmployeePayrollService.IOService.FILE_IO);
	        Assertions.assertEquals(5,entries);
	    }

	    @Test
	    public void givenFileFromReadingFormatFileShouldbematchEmployeeCount(){
	        EmployeePayrollService employeePayrollService = new EmployeePayrollService(null);
	        long entries = employeePayrollService.readEmployeePayRollData(EmployeePayrollService.IOService.FILE_IO);
	        Assertions.assertEquals(3,entries);
	    }
}