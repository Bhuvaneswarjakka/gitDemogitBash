import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mainCode
{
    public static void main(String[] args)
    {
        System.out.println("Hello");
        System.out.println("Addition : "+Calculator.sum(10, 20));
        System.out.println("Interest : "+ InterestCalculator.calculate(100000, 8, 10));
        System.out.println("SI : "+SICalculatorimpl.SI(100));
        System.out.println("CI : "+CICalculatorImpl.CI(200));
    }
}
