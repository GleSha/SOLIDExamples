package I.right.impl;

import I.right.TaskEfficiencyCalculator;
import I.right.WorkSheetEfficiencyCalculator;
import I.util.WorkTimeSheet;

import java.util.concurrent.ThreadLocalRandom;

public class ProgrammerEfficiencyCalculator implements WorkSheetEfficiencyCalculator, TaskEfficiencyCalculator {
    @Override
    public int getCompletedTasks() {
        return ThreadLocalRandom.current().nextInt(0, 42);
    }

    @Override
    public WorkTimeSheet getWorkTimeSheet() {
        return new WorkTimeSheet();
    }
}
