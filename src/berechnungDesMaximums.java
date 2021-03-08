import java.util.Arrays;
import java.util.Scanner;

public class berechnungDesMaximums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number or q to quit");

        int[] eingabe = new int[0];

        while (!scanner.hasNext("q")) {
            int number = scanner.nextInt();
            System.out.println("you entered " + number);

            int[] newArray = new int[eingabe.length + 1];
            for (int i = 0; i < eingabe.length; i++) {
                newArray[i] = eingabe[i];
            }
            newArray[eingabe.length] = number;
            eingabe = newArray;
            System.out.println(Arrays.toString(newArray));
        }
        int max = eingabe[0];
        for (int i = 0; i < eingabe.length; i++) {
            if (max < eingabe[i]) {
                max = eingabe[i];
            }
        }
        System.out.println("Das Maximum ist die Zahl " + max);
    }
}
