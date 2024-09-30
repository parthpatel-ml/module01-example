package com.spring.professional.exam.tutorial.module01.question03.dao;

import com.spring.professional.exam.tutorial.module01.question03.ds.FinancialMonthSummary;
import com.spring.professional.exam.tutorial.module01.question03.ds.FinancialQuarterSummary;
import com.spring.professional.exam.tutorial.module01.question03.ds.FinancialYearSummary;

abstract class AbsDatabaseStoreFinancialDataDao implements FinancialDataDao {
    @Override
    public FinancialYearSummary findFinancialYearSummary(int year) {
        System.out.println("Database Dao => findFinancialYearSummary");
        return new FinancialYearSummary();
    }

    @Override
    public FinancialQuarterSummary findFinancialQuarterSummary(int year, int quarter) {
        System.out.println("Database Dao => findFinancialQuarterSummary");
        return new FinancialQuarterSummary();
    }

    @Override
    public abstract FinancialMonthSummary findFinancialMonthSummary(int year, int month);
}
