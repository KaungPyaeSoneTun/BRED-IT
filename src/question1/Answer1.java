package question1;

import java.lang.Math;
import java.util.Scanner;

public class Answer1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount:");
        int amount = scanner.nextInt();
        System.out.println("Enter the point:");
        int point = scanner.nextInt();
        System.out.println("Input Amount="+amount+", point="+point+" => Output value="+new Answer1().process(amount,point));
    }

    // question is about calculation of decimal number on amount with the value of point
    // logic => amount/ (10^point)
    // if point is less than 0, return 0
    public double process(int amount,int point) {
        if (point < 0) {
            return 0;
        }
        final int base = 10;
        return amount/Math.pow(base,point);
    }
}
