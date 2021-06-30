package I.right.impl;

import I.right.CustomerEfficiencyCalculator;
import I.right.TaskEfficiencyCalculator;
import I.right.WorkSheetEfficiencyCalculator;
import I.util.WorkTimeSheet;

import java.util.concurrent.ThreadLocalRandom;

public class TeamLeadEfficiencyCalculator implements WorkSheetEfficiencyCalculator, TaskEfficiencyCalculator, CustomerEfficiencyCalculator {
    @Override
    public int getSatisfiedCustomers() {
        return ThreadLocalRandom.current().nextInt(0, 10);
    }

    @Override
    public int getCompletedTasks() {
        return ThreadLocalRandom.current().nextInt(0, 10);
    }

    @Override
    public WorkTimeSheet getWorkTimeSheet() {
        return new WorkTimeSheet();
    }
}
