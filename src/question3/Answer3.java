package question3;

import java.util.Scanner;

public class Answer3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ans;
        do {
            System.out.println("Enter angle:");
            int angle = scanner.nextInt();
            System.out.println("Input angle="+angle+" => Output time="+new Answer3().process(angle));
            System.out.println("\nDo you want to continue?(y/n)");
            ans = scanner.next().charAt(0);
        } while (ans == 'y');
    }

    public String process(int angle) {
        final double totDegree = 360, totHour = 12, totSecForMin=60;
        if (angle > totDegree) {
            return "Invalid Input";
        }
        // calculation of degree to hours: logic -> 1 circle has 360 degree and 360 degree is equal to 12 hour in the clock
        // divide an input value with degree and multiply with 12 to the division result gives the equivalent hour with decimal value.
        // whole integer from result decimal is hour and the rest is second. To convert sec to min - multiply with 60
        double res = (angle/totDegree) * totHour;
        int hour = (int) res;
        double sec = res - hour;
        long min = Math.round(sec*totSecForMin);
        return beautify(hour, min);
    }

    public String beautify(int hour, long min) {
        String str;
        str = hour < 10? "0"+hour: ""+hour;
        str = min < 10? str+":0"+min: str+":"+min;
        return str;
    }
}
