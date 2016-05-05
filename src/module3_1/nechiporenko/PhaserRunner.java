package module3_1.nechiporenko;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Phaser;

public class PhaserRunner {
    Integer[] arrayExample = new Integer[] {1, 1, 1, 2, 1, 3, 1, 4, 1, 5};
    SquareExecutor squareExecutor = new SquareExecutor();

    public static void main(String[] args) {
        PhaserRunner phaserRunner = new PhaserRunner();
        phaserRunner.testPhaser();
    }

    public void testPhaser() {
        Phaser executorsPhaser = new Phaser(5);

        for (int i = 0; i < 5; i++){
            new Thread(()-> {
                try {
                    int result = squareExecutor.getSquares(arrayExample, 0, 2);
                    System.out.println(Thread.currentThread().getName() + " sum is: " + result);
                } catch (ExecutionException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }


}
