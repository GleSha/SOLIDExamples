package I.wrong;

import I.util.WorkTimeSheet;

import java.util.concurrent.ThreadLocalRandom;

public class TeamLeadEfficiencyCalculator implements WorkerEfficiencyCalculator {
    @Override
    public int getCompletedTasks() {
        return ThreadLocalRandom.current().nextInt(0, 10);
    }

    @Override
    public int getSatisfiedCustomers() {
        return ThreadLocalRandom.current().nextInt(0, 10);
    }

    @Override
    public WorkTimeSheet getWorkTimeSheet() {
        return new WorkTimeSheet();
    }
}
