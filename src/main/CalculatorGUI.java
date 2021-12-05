package main;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;
import javafx.stage.Screen;

public class CalculatorGUI extends Application {
    private final Rectangle2D screenBounds = Screen.getPrimary().getBounds();
    private final int MAX_WIDTH = (int) screenBounds.getWidth();
    private final int MAX_HEIGHT = (int) screenBounds.getHeight();
    private static final int DEFAULT_WIDTH = 400;
    private static final int DEFAULT_HEIGHT = 500;

    private TextField displayField;

    private Calculator calculator = new Calculator();
    private boolean toClear = false;

    @Override
    public void start(Stage primaryStage) {
        final int colCount = 5;
        final int rowCount = 6;

        RowConstraints rc = new RowConstraints();
        rc.setPercentHeight(100d / rowCount);
        ColumnConstraints cc = new ColumnConstraints();
        cc.setPercentWidth(100d / colCount);

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        for(int i = 0; i < rowCount; i++)
            grid.getRowConstraints().add(rc);
        for(int i = 0; i < colCount; i++)
            grid.getColumnConstraints().add(cc);

        Scene scene = new Scene(grid, DEFAULT_WIDTH, DEFAULT_HEIGHT);

        displayField = new TextField();
        displayField.setPrefHeight(MAX_HEIGHT / (double) rowCount);
        displayField.setPrefWidth(MAX_WIDTH / (double) colCount);
        displayField.setPromptText("Numbers will appear here...");

        Button zero = new Button("0");
        zero.setPrefWidth(2 * MAX_WIDTH / (double) colCount);
        zero.setPrefHeight(MAX_HEIGHT / (double) rowCount);
        zero.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                numericButtonPressed("0");
            }
        });

        Button one = new Button("1");
        one.setPrefWidth(MAX_WIDTH / (double) colCount);
        one.setPrefHeight(MAX_HEIGHT / (double) rowCount);
        one.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                numericButtonPressed("1");
            }
        });

        Button two = new Button("2");
        two.setPrefWidth(MAX_WIDTH / (double) colCount);
        two.setPrefHeight(MAX_HEIGHT / (double) rowCount);
        two.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                numericButtonPressed("2");
            }
        });

        Button three = new Button("3");
        three.setPrefWidth(MAX_WIDTH / (double) colCount);
        three.setPrefHeight(MAX_HEIGHT / (double) rowCount);
        three.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                numericButtonPressed("3");
            }
        });

        Button four = new Button("4");
        four.setPrefWidth(MAX_WIDTH / (double) colCount);
        four.setPrefHeight(MAX_HEIGHT / (double) rowCount);
        four.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                numericButtonPressed("4");
            }
        });

        Button five = new Button("5");
        five.setPrefWidth(MAX_WIDTH / (double) colCount);
        five.setPrefHeight(MAX_HEIGHT / (double) rowCount);
        five.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                numericButtonPressed("5");
            }
        });

        Button six = new Button("6");
        six.setPrefWidth(MAX_WIDTH / (double) colCount);
        six.setPrefHeight(MAX_HEIGHT / (double) rowCount);
        six.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                numericButtonPressed("6");
            }
        });

        Button seven = new Button("7");
        seven.setPrefWidth(MAX_WIDTH / (double) colCount);
        seven.setPrefHeight(MAX_HEIGHT / (double) rowCount);
        seven.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                numericButtonPressed("7");
            }
        });

        Button eight = new Button("8");
        eight.setPrefWidth(MAX_WIDTH / (double) colCount);
        eight.setPrefHeight(MAX_HEIGHT / (double) rowCount);
        eight.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                numericButtonPressed("8");
            }
        });

        Button nine = new Button("9");
        nine.setPrefWidth(MAX_WIDTH / (double) colCount);
        nine.setPrefHeight(MAX_HEIGHT / (double) rowCount);
        nine.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                numericButtonPressed("9");
            }
        });

        Button dot = new Button(".");
        dot.setPrefWidth(MAX_WIDTH / (double) colCount);
        dot.setPrefHeight(MAX_HEIGHT / (double) rowCount);
        dot.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                numericButtonPressed(".");
            }
        });

        Button multiply = new Button("*");
        multiply.setPrefWidth(MAX_WIDTH / (double) colCount);
        multiply.setPrefHeight(MAX_HEIGHT / (double) rowCount);
        multiply.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                operationButtonPressed("*", Calculator.MULT_OP);
            }
        });

        Button divide = new Button("/");
        divide.setPrefWidth(MAX_WIDTH / (double) colCount);
        divide.setPrefHeight(MAX_HEIGHT / (double) rowCount);
        divide.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                operationButtonPressed("/", Calculator.DIV_OP);
            }
        });

        Button add = new Button("+");
        add.setPrefWidth(MAX_WIDTH / (double) colCount);
        add.setPrefHeight(MAX_HEIGHT / (double) rowCount);
        add.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                operationButtonPressed("+", Calculator.ADD_OP);
            }
        });

        Button minus = new Button("-");
        minus.setPrefWidth(MAX_WIDTH / (double) colCount);
        minus.setPrefHeight(MAX_HEIGHT / (double) rowCount);
        multiply.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                operationButtonPressed("-", Calculator.SUB_OP);
            }
        });

        Button equals = new Button("=");
        equals.setPrefWidth(MAX_WIDTH / (double) colCount);
        equals.setPrefHeight(MAX_HEIGHT / (double) rowCount);
        equals.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                compute();
            }
        });

        Button negate = new Button("+/-");
        negate.setPrefWidth(MAX_WIDTH / (double) colCount);
        negate.setPrefHeight(MAX_HEIGHT / (double) rowCount);
        negate.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                negateButtonPressed();
            }
        });

        Button clear = new Button("C");
        clear.setPrefWidth(MAX_WIDTH / (double) colCount);
        clear.setPrefHeight(MAX_HEIGHT / (double) rowCount);
        clear.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                clear();
            }
        });

        Button clearEntry = new Button("CE");
        clearEntry.setPrefWidth(MAX_WIDTH / (double) colCount);
        clearEntry.setPrefHeight(MAX_HEIGHT / (double) rowCount);
        clearEntry.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                clearEntry();
            }
        });

        Button sqrt = new Button("√");
        sqrt.setPrefWidth(MAX_WIDTH / (double) colCount);
        sqrt.setPrefHeight(MAX_HEIGHT / (double) rowCount);
        sqrt.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                sqrtButtonPressed();
            }
        });

        Button square = new Button("x²");
        square.setPrefWidth(MAX_WIDTH / (double) colCount);
        square.setPrefHeight(MAX_HEIGHT / (double) rowCount);
        square.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                squareButtonPressed();
            }
        });

        Button pow = new Button("x\u02b8");
        pow.setPrefWidth(MAX_WIDTH / (double) colCount);
        pow.setPrefHeight(MAX_HEIGHT / (double) rowCount);
        pow.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                operationButtonPressed("^", Calculator.POW_OP);
            }
        });

        Slider slider = new Slider();
        slider.setPrefWidth(MAX_WIDTH / (double) colCount);
        slider.setPrefHeight(2 * MAX_HEIGHT / (double) rowCount);
        slider.setOrientation(Orientation.VERTICAL);

        grid.add(displayField, 0, 0, colCount, 1);
        grid.add(zero, 1, rowCount-1, 2, 1);
        grid.add(one, 3, 4);
        grid.add(two, 2, 4);
        grid.add(three, 1, 4);
        grid.add(four, 3, 3);
        grid.add(five, 2, 3);
        grid.add(six, 1, 3);
        grid.add(seven, 3, 2);
        grid.add(eight, 2, 2);
        grid.add(nine, 1, 2);
        grid.add(dot, 3, rowCount - 1);
        grid.add(multiply, 4, 1);
        grid.add(divide, 4, 2);
        grid.add(add, 4, 3);
        grid.add(minus, 4, 4);
        grid.add(equals, 4, 5);
        grid.add(negate, 3, 1);
        grid.add(clear, 2, 1);
        grid.add(clearEntry, 1, 1);
        grid.add(sqrt, 0, 3);
        grid.add(square, 0, 4);
        grid.add(pow, 0, 5);
        grid.add(slider, 0, 1, 1, 2);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Calculator");
        System.out.println(System.getProperty("user.dir"));
        primaryStage.getIcons().add(new Image("file:./src/resources/icon.png"));
        primaryStage.show();
    }

    private void updateDisplayedValue() {
        String toDisplay = Float.toString(this.calculator.getCurrentValue());
        if((toDisplay.endsWith(".0")))
            toDisplay = toDisplay.substring(0, toDisplay.length() - 2);

        this.displayField.setText(toDisplay);

    }

    private void numericButtonPressed(String value) {
        if(toClear) {
            this.toClear = false;
            this.displayField.clear();
        }
        this.displayField.appendText(value);
    }

    private void operationButtonPressed(String operationDisplayed, String operationKey) {
        this.calculator.setCurrentOperation(operationKey);
        this.calculator.setCurrentValue(Float.parseFloat(this.displayField.getText()));
        this.displayField.appendText(operationDisplayed);
        this.toClear = true;
    }

    private void negateButtonPressed() {
        if(this.displayField.getText().charAt(0) == '-')
            this.displayField.setText(this.displayField.getText().substring(1));
        else
            this.displayField.setText("-" + this.displayField.getText());
    }

    private void sqrtButtonPressed() {
        if(this.calculator.getCurrentOperation() == null) {
            this.calculator.sqrtValue(Float.parseFloat(this.displayField.getText()));
            updateDisplayedValue();
        }
    }

    private void squareButtonPressed() {
        if(this.calculator.getCurrentOperation() == null) {
            this.calculator.squareValue(Float.parseFloat(this.displayField.getText()));
            updateDisplayedValue();
        }
    }

    private void clear() {
        this.toClear = false;
        this.displayField.clear();
        this.calculator.clearAll();
    }

    private void clearEntry() {
        this.toClear = false;
        this.displayField.clear();
    }

    private void compute() {
        if(this.calculator.getCurrentOperation() != null) {
            this.calculator.compute(Float.parseFloat(displayField.getText()));
            updateDisplayedValue();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
