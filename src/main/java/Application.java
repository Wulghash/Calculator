import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {


    public static void main(String[] args) throws IOException {
        Calculator calculator = new CalculatorImpl();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String expression = reader.readLine();

        System.out.println(calculator.getCalculatedResult(expression));

    }
}
