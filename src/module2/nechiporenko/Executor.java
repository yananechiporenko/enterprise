package module2.nechiporenko;

import java.util.List;

public interface Executor <T> {

        void addTask(Task <Long> task);

        void addTask(Task <Long> task, Validator validator);

        void execute();

        List<? extends T> getValidResults();

        List<? extends T> getInvalidResults();
}
