import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FoolCheck {

    public static void methodToTest(int number) {
        int res = 100 / number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String word;
//
//        do {
//            word = sc.next();
//        } while (word.length() > 10);

//        methodToTest(0);

        int a;
        try {
            a = sc.nextInt();
            throw new ArithmeticException();
        }
        catch (Exception e) {
            System.out.println("Введено не число");
            System.out.println(e.getClass());
            a = 9;
        }
        finally {
          System.out.println("Конец программы");
        }

        System.out.println(a);

        try {
            methodWithException();
        }
        catch (Exception e) {
            System.out.println(e.getClass());
        }
    }

    public static void methodWithFileException() throws IOException {
        FileWriter a = new FileWriter("mk");
    }

    public static void methodWithException() throws FileNotFoundException {
        throw new FileNotFoundException();
    }
}
