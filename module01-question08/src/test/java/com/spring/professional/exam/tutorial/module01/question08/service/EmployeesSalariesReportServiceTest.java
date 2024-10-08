package com.spring.professional.exam.tutorial.module01.question08.service;

import com.spring.professional.exam.tutorial.module01.question08.bls.EmployeeSalaryCalculator;
import com.spring.professional.exam.tutorial.module01.question08.dao.EmployeeDao;
import com.spring.professional.exam.tutorial.module01.question08.report.XlsSalaryReport;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {EmployeesSalariesReportService.class,
        EmployeeDao.class, EmployeeSalaryCalculator.class, XlsSalaryReport.class
})
public class EmployeesSalariesReportServiceTest {

    @Autowired
    private EmployeesSalariesReportService employeesSalariesReportService;

    @Test
    public void shouldGenerateReport() {
        employeesSalariesReportService.generateReport();

        // assertions to check if code worked correctly
    }
}