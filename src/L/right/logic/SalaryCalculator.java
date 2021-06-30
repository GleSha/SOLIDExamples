package L.right.logic;

import java.math.BigDecimal;

public interface SalaryCalculator {
    BigDecimal calculateSalary(BigDecimal rate, int workDaysCount) throws NotEnoughWorkDaysForSuchProfessionalException;

    //other methods
}
