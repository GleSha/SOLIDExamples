package L.right.logic;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.concurrent.ThreadLocalRandom;

public class SeniorProgrammerSalaryCalculator extends ProgrammerSalaryCalculator {
    @Override
    public BigDecimal calculateSalary(BigDecimal rate, int workDaysCount) throws NotEnoughWorkDaysForSuchProfessionalException {
        if (workDaysCount <= 5) {
            throw new NotEnoughWorkDaysForSuchProfessionalException("how dare you?");
        }
        BigDecimal currentMonthWorkDaysCount = BigDecimal.valueOf(ThreadLocalRandom.current().nextInt(29, 31));
        return BigDecimal.valueOf(ThreadLocalRandom.current().nextDouble(0, 20))
                .multiply(rate)
                .add(rate.divide(currentMonthWorkDaysCount, RoundingMode.CEILING)
                        .multiply(BigDecimal.valueOf(workDaysCount)));
    }
}
