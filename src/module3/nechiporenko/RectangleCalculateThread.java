package module3.nechiporenko;

import java.util.ArrayList;
import java.util.List;

public class RectangleCalculateThread implements Runnable {
    List<Rectangle> rectangles = new ArrayList<>();
    AreaCalculator rectangleCalculator = new AreaCalculator();

    public void populate(int amount) {
        for (int i = 0; i < amount; i++) {
            int tempRandom1 = i + amount;
            int tempRandom2 = i + amount/2;
            rectangles.add(new Rectangle(tempRandom1, tempRandom2));
            System.out.println("rectangle sides: " + tempRandom1 + ", "+ tempRandom2);
        }
        System.out.println();
    }

    @Override
    public void run() {

        for (Rectangle rectangle : rectangles) {
            try {
                int tempArea = rectangleCalculator.rectangleCalculate(rectangle);
                rectangle.setArea(tempArea);
                System.out.println("rectangle area: " + tempArea);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
