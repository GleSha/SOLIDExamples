package I.wrong;

import I.util.WorkTimeSheet;

import java.util.concurrent.ThreadLocalRandom;

public class ManagerEfficiencyCalculator implements WorkerEfficiencyCalculator {
    @Override
    public int getCompletedTasks() {
        System.out.println("i don't write code");
        return 0;
    }

    @Override
    public int getSatisfiedCustomers() {
        return ThreadLocalRandom.current().nextInt(0,  42);
    }

    @Override
    public WorkTimeSheet getWorkTimeSheet() {
        return new WorkTimeSheet();
    }

    //other methods
}
