# Clarkson University CS242: Calculator  

### Authors: Matthew Sprague, Aaron Jones  

This is the repo for a GUI Calculator developed using JavaFX for our CS242 class.

The calculator can handle a variety of unary and binary operations, and can be interacted with using either the GUI buttons or the keyboard.  The calculator can also handle multi-digit inputs and decimals, up to the limit of a `float`.  The GUI was styled using CSS.

The calculator is designed with a "backend" `Calculator.java` and a "frontend" `CalculatorGUI.java`.  The majority of the operations are handled by the backend class, and operations are given defined codes here as Strings.  The frontend application calls different methods in the backend calculator to perform operations with numbers taken in from the user.  

As a feature unusual in other calculators, our calculator allows the user to specify an input using a slider.  
