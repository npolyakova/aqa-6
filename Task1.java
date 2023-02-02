import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {

    //Найти значение S = π × r2, если введен радиус
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r;
        double s;

        boolean condition = true;
        while (condition) {
            try {
                r = sc.nextInt();
                s = Math.PI * Math.pow(r, 2);
                System.out.println(s);
                condition = false;
                //break;
            }
            catch (InputMismatchException e) {
                System.out.println("Введено не число");

            }
        }
    }
}
