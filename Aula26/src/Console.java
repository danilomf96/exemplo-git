import java.util.Scanner;

public class Console {
    private static Scanner scanner = new Scanner(System.in);

    public static int lerInt() {
        int valor = scanner.nextInt();
        scanner.nextLine();
        return valor;
    }

    public static String lerString() {
        String valor = scanner.nextLine();
        return valor;
    }
}
