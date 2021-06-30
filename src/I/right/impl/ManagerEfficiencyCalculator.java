package I.right.impl;

import I.right.CustomerEfficiencyCalculator;
import I.right.WorkSheetEfficiencyCalculator;
import I.util.WorkTimeSheet;

import java.util.concurrent.ThreadLocalRandom;

public class ManagerEfficiencyCalculator implements WorkSheetEfficiencyCalculator, CustomerEfficiencyCalculator {
    @Override
    public int getSatisfiedCustomers() {
        return ThreadLocalRandom.current().nextInt(0, 42);
    }

    @Override
    public WorkTimeSheet getWorkTimeSheet() {
        return new WorkTimeSheet();
    }
}
