package L.wrong.using;

import L.wrong.logic.SalaryCalculator;

import java.math.BigDecimal;

public class SomeBusinessLogicClass {


    public BigDecimal work(SalaryCalculator salaryCalculator) {
        BigDecimal rate = BigDecimal.valueOf(5000);
        int workDaysCount = 22;
        //Exception we don't expect
        return salaryCalculator.calculateSalary(rate, workDaysCount);
    }
}
