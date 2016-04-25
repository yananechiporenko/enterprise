package module3.nechiporenko;

public class AreaCalculator implements Semaphore {
    private final double Pi = 3.14;
    private final Object lock = new Object();
    private int permits = 3;


    public double circleCalculate(Circle circle) throws InterruptedException {

            acquire();
            int circlesArea = (int)(Pi * circle.getRadius() * circle.getRadius());
            release();
            return circlesArea;

    }

    public int squareCalculate (Square square) throws InterruptedException {

            acquire(2);
            int squaresArea = square.getSide() * square.getSide();
            release(2);
            return squaresArea;

    }

    public int rectangleCalculate (Rectangle rectangle) throws InterruptedException {

            acquire(3);
            int rectanglesArea = rectangle.getSide1() * rectangle.getSide2();
            release(3);
            return rectanglesArea;

    }

    @Override
    public void acquire() throws InterruptedException {
        synchronized (lock) {
            if (permits < 1) {
                lock.wait();
            } else {
                permits -= 1;
            }
        }
    }

    @Override
    public void acquire(int permits) throws InterruptedException {
        synchronized (lock) {
            if (this.permits < permits) {
                lock.wait();
            } else {
                this.permits -= permits;
            }
        }
    }

    @Override
    public void release() {
        synchronized (lock) {
            permits += 1;
            lock.notify();
        }
    }

    @Override
    public void release(int permits) {
        synchronized (lock) {
            this.permits += permits;
            lock.notifyAll();
        }
    }

    @Override
    public int getAvailablePermits() {
        return permits;
    }
}
