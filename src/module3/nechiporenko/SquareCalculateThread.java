package module3.nechiporenko;

import java.util.ArrayList;
import java.util.List;

public class SquareCalculateThread implements Runnable {
    List<Square> squares = new ArrayList<>();
    AreaCalculator squareCalculator = new AreaCalculator();

    public void populate(int amount) {
        for (int i = 0; i < amount; i++) {
            int tempRandom = i + amount;
            squares.add(new Square(tempRandom));
            System.out.println("square side: " + tempRandom);
        }
        System.out.println();
    }

    @Override
    public void run() {

        for (Square square : squares) {
            try {
                int tempArea = squareCalculator.squareCalculate(square);
                square.setArea(tempArea);
                System.out.println("square area: " + tempArea);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
