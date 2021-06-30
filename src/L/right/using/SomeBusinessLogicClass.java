package L.right.using;

import L.right.logic.NotEnoughWorkDaysForSuchProfessionalException;
import L.right.logic.SalaryCalculator;

import java.math.BigDecimal;

public class SomeBusinessLogicClass {


    public BigDecimal work(SalaryCalculator salaryCalculator) {
        BigDecimal rate = BigDecimal.valueOf(5000);
        int workDaysCount = 22;
        //Exception we don't expect
        try {
            return salaryCalculator.calculateSalary(rate, workDaysCount);
        } catch (NotEnoughWorkDaysForSuchProfessionalException e) {
            e.printStackTrace();
            System.out.println("bankruptcy panic!111");
            return BigDecimal.ZERO;
        }
    }
}
