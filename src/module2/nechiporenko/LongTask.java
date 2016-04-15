package module2.nechiporenko;

public class LongTask implements Task <Long> {
    private long number1;
    private long number2;
    private Long result;

    public long getNumber2() {
        return number2;
    }

    public long getNumber1() {
        return number1;
    }


    public LongTask(long number1, long number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    @Override
    public void execute() {
        result = number1 + number2;
    }

    @Override
    public Long getResult() {
        return result;
    }
}
