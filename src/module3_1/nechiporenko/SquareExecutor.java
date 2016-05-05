package module3_1.nechiporenko;

import java.util.concurrent.*;

public class SquareExecutor {
    public int getSquares (Integer [] area, int startPosition, int amount) throws ExecutionException, InterruptedException {
        ExecutorService areaExecutor = Executors.newSingleThreadExecutor();

        Future<Integer> futureResult = areaExecutor.submit((Callable<Integer>) () -> {
            int sum = 0;
            for (int i = startPosition; i < startPosition + amount; i++) {
                sum += (area[i] * area[i]);
            }
            return sum;
        });
        int result = futureResult.get();
        areaExecutor.shutdown();
        return result;
    }
    }


