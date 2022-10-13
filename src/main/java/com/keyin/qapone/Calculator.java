//we're gonna need a scanner to take in the user input
//since we are making a calculator, we are gonna need some memory
//to save some variables like operand1, operand2, operator, and result
//we will make a switch statement for the calculator with each case statement
//being a different operation--only the basic four(/*+-)
//firstly initialize a new scanner for us to use to access user inputs
//DON"T FORGET TO IMPORT SCANNER FROM JAVA UTIL LIBRARY
//scanner to take in user input, then save input in memory as variable
//DON"T FORGET TO CLOSE UP SCANNER

package com.keyin.qapone;
import java.lang.reflect.Executable;
import java.util.Scanner;


public class Calculator {
//new methods go here--make static so accessible to main
//set aside memory in form of variables
    static int firstOperand, secondOperand, finalResult;
    static char chosenOperator;

//following methods to take in numbers, process them, and return a result
//to be used for testing
    public int addition(int operand1, int operand2){
        int additionResult = operand1 + operand2;
        return additionResult;
    }

    public int division(int operand1, int operand2){
        int divisionResult = operand1 + operand2;
        return divisionResult;
    }
    public int multiplication(int operand1, int operand2){
        int multiplicationResult = operand1 * operand2;
        return multiplicationResult;

    }


    private void displayConcatenatedResults(){
//display the results in a finely concatenated string
        System.out.println("Result of "
                + firstOperand + " "
                + chosenOperator + " "
                + secondOperand + " = "
                + finalResult);

    }
//following methods to be used to fancy up the code
    public int divisionEquation(){
        finalResult = firstOperand / secondOperand;
        return finalResult;
    }
    public int multiplicationEquation(){
        finalResult = firstOperand * secondOperand;
        return finalResult;
    }
    public int subtractionEquation(){
        finalResult = firstOperand - secondOperand;
        return finalResult;
    }
    public int additionEquation(){
        finalResult = firstOperand + secondOperand;
        return finalResult;
    }







//main method
//actual calculator program is here
    public static void main(String[] args) {
        Scanner userInput = new Scanner( System.in );
        Calculator newCalculator = new Calculator();

//call on the scanner to grab the most recent integer passed to it
//and save it in memory as each variable
//for operator we need to grab next character at index of 0 from scanner
        System.out.println("Select first operand: ");
        firstOperand = userInput.nextInt();
        System.out.println("Select second operand: ");
        secondOperand = userInput.nextInt();
        System.out.println("Select operator(*/-+):");
        chosenOperator = userInput.next().charAt(0);
        System.out.println();

        switch (chosenOperator){
            case'/':
//calculations
//print statement
                newCalculator.divisionEquation();
                newCalculator.displayConcatenatedResults();
                break;
            case'*':
//calculations
//print statement
                newCalculator.multiplicationEquation();
                newCalculator.displayConcatenatedResults();
                break;
            case'+':
//calculations
//print statement
                newCalculator.additionEquation();
                newCalculator.displayConcatenatedResults();
                break;
            case'-':
//calculations
//print statement
                newCalculator.subtractionEquation();
                newCalculator.displayConcatenatedResults();
                break;
            default:
                System.out.println("Invalid operator selected");
                break;
        }
        userInput.close();

    }

}
