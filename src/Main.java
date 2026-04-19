import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Task 1
        System.out.println("Task 1");

        double[] arrSalary = {80_000, 100_000, 120_000, 80_000, 80_000};
        double sum = 0;

        for (double current : arrSalary) {
            sum += current;
        }

        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        //Task 2
        System.out.println("Task 2");

        double minLead = Double.MAX_VALUE;
        double maxLead = Double.MIN_VALUE;

        for (double current : arrSalary) {
            if (current < minLead) {
                minLead = current;
            }

            if (current > maxLead) {
                maxLead = current;
            }
        }

        System.out.println("Минимальная сумма трат за неделю составила " + minLead + " рублей. Максимальная сумма трат за неделю составила " + maxLead + " рублей");

        //Task 3
        System.out.println("Task 3");

        sum = 0;
        for (double current : arrSalary) {
            sum += current;
        }

        double middleLead = sum / arrSalary.length;

        System.out.println("Средняя сумма трат за месяц составила " + middleLead + " рублей");

        //Task 4
        System.out.println("Task 4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int index = 0; index < reverseFullName.length / 2; index++) {
            char letter = reverseFullName[index];
            reverseFullName[index] = reverseFullName[reverseFullName.length - 1 - index];
            reverseFullName[reverseFullName.length - 1 - index] = letter;
        }

        for (int i = 0; i < reverseFullName.length; i++) {
            if (i == reverseFullName.length - 1) {
                System.out.println(reverseFullName[i] + ".");
            } else {
                System.out.print(reverseFullName[i]);
            }
        }
    }
}