package main;

public class Calculator {
    /**
     * A key used for addition.
     */
    public final static String ADD_OP = "+";
    /**
     * A key used for subtraction.
     */
    public final static String SUB_OP = "−";
    /**
     * A key used for multiplication.
     */
    public final static String MULT_OP = "*";
    /**
     * A key used for division.
     */
    public final static String DIV_OP = "/";
    /**
     * A key used for negation.
     */
    public final static String NEG_OP = "+/-";
    /**
     * A key used for square.
     */
    public final static String SQ_OP = "x²";
    /**
     * A key used for square root.
     */
    public final static String SQRT_OP = "√";
    /**
     * A key used for exponents.
     */
    public final static String POW_OP = "^";

    /**
     * The current value held in the Calculator.
     */
    private float currentValue;
    /**
     * The current operation to be performed by the Calculator.
     */
    private String currentOperation;

    /**
     * Constructor.
     */
    public Calculator() {
        clearAll();
    }

    /**
     * Returns the value currently held in this Calculator.
     *
     * @return This Calculator's currentValue.
     */
    public float getCurrentValue() {
        return this.currentValue;
    }

    /**
     * Returns the operation currently held in this Calculator.
     *
     * @return This Calculator's currentOperation
     */
    public String getCurrentOperation() {
        return this.currentOperation;
    }

    /**
     * Sets the current value of this Calculator.
     *
     * @param newValue The new value for this Calculator's currentValue.
     */
    public void setCurrentValue(float newValue) {
        this.currentValue = newValue;
    }

    /**
     * Sets the current operation of this Calculator.
     *
     * @param newOperation The new operation for this Calculator's currentOperation.
     */
    public void setCurrentOperation(String newOperation) {
        this.currentOperation = newOperation;
    }

    /**
     * Clears all of this Calculator's parameters.
     */
    public void clearAll() {
        this.currentOperation = null;
        this.currentValue = 0;
    }

    /**
     * Implements addition.
     *
     * @param secondValue The value to add to this Calculator's currentValue.
     */
    public void addValue(float secondValue) {
        this.currentValue += secondValue;
    }

    /**
     * Implements subtraction.
     *
     * @param secondValue The value to subtract from this Calculator's currentValue.
     */
    public void subtractValue(float secondValue) {
        this.currentValue -= secondValue;
    }

    /**
     * Implements multiplication.
     *
     * @param secondValue The value to multiply this Calculator's currentValue by.
     */
    public void multipleValue(float secondValue) {
        this.currentValue *= secondValue;
    }

    /**
     * Implements division.
     *
     * @param secondValue The value to divide this Calculator's currentValue by.
     */
    public void divideValue(float secondValue) {
        this.currentValue /= secondValue;
    }

    /**
     * Implements exponential operations.
     *
     * @param secondValue The value to which this Calculator's currentValue should be raised.
     */
    public void powerValue(float secondValue) {
        this.currentValue = (float) Math.pow(currentValue, secondValue);
    }

    /**
     * Implements squaring operations.
     *
     * @param secondValue The value which should be squared.
     */
    public void squareValue(float secondValue) {
        this.currentValue = secondValue;
        powerValue(2);
    }

    /**
     * Implements square root.
     *
     * @param secondValue The value which should be square rooted.
     */
    public void sqrtValue(float secondValue) {
        this.currentValue = (float) Math.sqrt(secondValue);
    }

    /**
     * Computes an operation based on this Calculator's currentOperation
     *
     * @param secondValue The second value with which the operation should be performed.
     */
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