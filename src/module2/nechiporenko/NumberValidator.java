package module2.nechiporenko;

public class NumberValidator implements Validator<Number> {
    @Override
    public boolean isValid(Number result) {
        if (!(result == null)) return true;
        return false;
    }
}
