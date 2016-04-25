package module3.nechiporenko;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        CircleCalculateThread circleThread = new CircleCalculateThread();
        SquareCalculateThread squareThread = new SquareCalculateThread();
        RectangleCalculateThread rectangleThread = new RectangleCalculateThread();

        circleThread.populate(12);
        squareThread.populate(41);
        rectangleThread.populate(36);

        new Thread(circleThread).start();
        new Thread(squareThread).start();
        new Thread(rectangleThread).start();

        Thread.sleep(100);
    }
}
