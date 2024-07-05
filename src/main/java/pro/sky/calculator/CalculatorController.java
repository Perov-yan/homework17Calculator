package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService){
        this.calculatorService = calculatorService;
    }


    @GetMapping
    public String hello() {
        return "Добро пожаловать в калькулятор!";
    }

    @GetMapping(path = "/plus")
    public String plus (@RequestParam int num1, @RequestParam int num2) {
        return  num1 + " + " + num2 + " = " + calculatorService.sum(num1,num2);
    }

    @GetMapping(path = "/minus")
    public String minus (@RequestParam int num1, @RequestParam int num2) {
        return  num1 + " - " + num2 + " = " + calculatorService.subtraction(num1,num2);

    }

    @GetMapping(path = "/multiply")
    public String multiply (@RequestParam int num1, @RequestParam int num2) {
        return  num1 + " * " + num2 + " = " + calculatorService.multiplication(num1,num2);

    }

    @GetMapping(path = "/divide")
    public String divide (@RequestParam int num1, @RequestParam int num2) {
         try {
             return num1 + " / " + num2 + " = " + calculatorService.division(num1,num2);
         } catch (ArithmeticException e) {
             return "Делить на 0 нельзя.";
         }
    }

}
