package module3.nechiporenko;

import java.util.ArrayList;
import java.util.List;

public class CircleCalculateThread implements Runnable{
    List <Circle> circles = new ArrayList<>();
    AreaCalculator circleCalculator = new AreaCalculator();

    public void populate(int amount) {
        for (int i = 0; i < amount; i++) {
            int tempRandom = i + amount;
            circles.add(new Circle(tempRandom));
            System.out.println("circle radius: " + tempRandom);
        }
        System.out.println();
    }

    @Override
    public void run() {

        for (Circle circle : circles) {
            try {
                int tempArea = (int) circleCalculator.circleCalculate(circle);
                circle.setArea(tempArea);
                System.out.println("circle area: " + tempArea);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
