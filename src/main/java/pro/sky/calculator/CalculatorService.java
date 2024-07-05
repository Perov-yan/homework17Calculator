package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    int result;


    public int sum( int num1, int num2){
        result = num1 + num2;
        return result;
    }

    public int subtraction(int num1, int num2){
        result = num1 - num2;
        return result;
    }
    //  division
    public int multiplication(int num1, int num2){
        result = num1 * num2;
        return result;
    }

    public int division(int num1, int num2){
        result = num1 / num2;
        return result;
    }


}
