import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import static java.lang.Character.isDigit;

public class CalculatorImpl implements Calculator {

    List<Character> resultList = new ArrayList<Character>();
    Stack<Character> operations = new Stack<Character>();

    public String getCalculatedResult(String expression) {
        setupOperationsPriorities();
        char [] symbols = expression.toCharArray();


        for (char symbol : symbols) {
            if (isDigit(symbol)) {
                resultList.add(symbol);
            } else {
                checkOperationsStack(symbol);
            }
        }

        return null;
    }


    private void checkOperationsStack(char symbol) {
        char lastSymbol = operations.peek();
    }

    private void setupOperationsPriorities() {

    }



}
