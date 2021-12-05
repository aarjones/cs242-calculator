package main;

public class Calculator {
    public final static String ADD_OP = "+";
    public final static String SUB_OP = "−";
    public final static String MULT_OP = "×";
    public final static String DIV_OP = "÷";
    public final static String NEG_OP = "±";
    public final static String SQ_OP = "x²";
    public final static String SQRT_OP = "√";
    public final static String POW_OP = "^";

    private float currentValue;
    private String currentOperation;

    public Calculator() {
        clearAll();
    }

    public String[] getOperations() {
        return new String[] {ADD_OP, SUB_OP, MULT_OP, DIV_OP, NEG_OP, SQ_OP, SQRT_OP, POW_OP};
    }

    public float getCurrentValue() {
        return this.currentValue;
    }

    public String getCurrentOperation() {
        return this.currentOperation;
    }

    public void setCurrentValue(float newValue) {
        this.currentValue = newValue;
    }

    public void setCurrentOperation(String newOperation) {
        this.currentOperation = newOperation;
    }

    public void clearAll() {
        this.currentOperation = null;
        this.currentValue = 0;
    }

    public void addValue(float secondValue) {
        this.currentValue += secondValue;
    }

    public void subtractValue(float secondValue) {
        this.currentValue -= secondValue;
    }

    public void multipleValue(float secondValue) {
        this.currentValue *= secondValue;
    }

    public void divideValue(float secondValue) {
        this.currentValue /= secondValue;
    }

    public void powerValue(float secondValue) {
        this.currentValue = (float) Math.pow(currentValue, secondValue);
    }

    public void negateValue(float secondValue) {
        this.currentValue = -secondValue;
    }

    public void squareValue(float secondValue) {
        this.currentValue = secondValue;
        powerValue(2);
    }

    public void sqrtValue(float secondValue) {
        this.currentValue = (float) Math.sqrt(secondValue);
    }



    public void compute(float secondValue) {
        switch (currentOperation) {
            case ADD_OP:
                addValue(secondValue);
                break;
            case SUB_OP:
                subtractValue(secondValue);
                break;
            case MULT_OP:
                multipleValue(secondValue);
                break;
            case DIV_OP:
                divideValue(secondValue);
                break;
            case POW_OP:
                powerValue(secondValue);
                break;
        }
    }
}