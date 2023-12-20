package com.example.demo;

import com.example.demo.ExcelSheetReader.ExcelParser;
import com.example.demo.Model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		ExcelParser excelReader=new ExcelParser();
		List<Employee> Employees=excelReader.getEmployeeList();
	}
}
