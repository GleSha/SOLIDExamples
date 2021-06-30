package L.wrong.logic;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.concurrent.ThreadLocalRandom;

public class WorkerSalaryCalculator implements SalaryCalculator {
    @Override
    public BigDecimal calculateSalary(BigDecimal rate, int workDaysCount) {
        if (workDaysCount <= 0) {
            return BigDecimal.ZERO;
        }
        BigDecimal currentMonthWorkDaysCount = BigDecimal.valueOf(ThreadLocalRandom.current().nextInt(29, 31));
        return rate.divide(currentMonthWorkDaysCount, RoundingMode.CEILING).multiply(BigDecimal.valueOf(workDaysCount));
    }
}
