package module2.nechiporenko;

import java.util.Arrays;
import java.util.List;

public class ExecutorNumber implements Executor<Number> {
    List<Task> tasksList = Arrays.asList();
    List<Long> validResults = Arrays.asList();
    List<Long> invalidResults = Arrays.asList();

    @Override
    public void addTask(Task <Long> task) {
        tasksList.add(task);

    }

    @Override
    public void addTask(Task <Long> task, Validator validator) {
        task.execute();
        Long result = task.getResult();
        boolean taskIsValid = validator.isValid(result);
        if (taskIsValid) {
            validResults.add(result);
        } else {
            invalidResults.add(result);
        }

    }

    @Override
    public void execute() {
        for (Task task : tasksList) {
            task.execute();
        }

    }

    @Override
    public List<Long> getValidResults() {
        return validResults;
    }

    @Override
    public List<Long> getInvalidResults() {
        return invalidResults;
    }
}
