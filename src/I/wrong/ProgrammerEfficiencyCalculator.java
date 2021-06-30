package I.wrong;

import I.util.WorkTimeSheet;

import java.util.concurrent.ThreadLocalRandom;

public class ProgrammerEfficiencyCalculator implements WorkerEfficiencyCalculator {
    @Override
    public int getCompletedTasks() {
        return ThreadLocalRandom.current().nextInt(0, 42);
    }

    @Override
    public int getSatisfiedCustomers() {
        System.out.println("i don't work with customers");
        return 0;
    }

    @Override
    public WorkTimeSheet getWorkTimeSheet() {
        return new WorkTimeSheet();
    }

    //other methods
}
