package module2.nechiporenko;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

public class LongTaskTest {

    @Test
    public void testTaskExecute() throws Exception {
        Task <Long> task = new LongTask(10L, 20L);
        task.execute();
        assertEquals(task.getResult(), (Long) 30L);

    }

    @Test
    public void testIsValid() throws Exception {
        Task <Long> task = new LongTask(10L, 20L);
        task.execute();
      //  Validator numberValidator = new NumberValidator (task.getResult());
        assertEquals(task.getResult(), (Long) 30L);

    }

//    @Test
//    public void testGetValidResults() throws Exception {
//        Task <Long> task1 = new LongTask(10L, 20L);
//        Task <Long> task2 = new LongTask(20L, 30L);
//        Task <Long> task3 = new LongTask(30L, 40L);
//
//        List <Task> taskList = Arrays.asList(task1, task2, task3);
//       // Executor <Number> numberExecutor = new ExecutorNumber();
//       // Validator <Long> numberValidator = new NumberValidator();
//
//        for (Task task : taskList) {
//           // numberExecutor.addTask(task, numberValidator);
//        }
//
//       // for (Number result : numberExecutor.getValidResults()) {
//        //    System.out.println(result);
//        }
//
//    }

}