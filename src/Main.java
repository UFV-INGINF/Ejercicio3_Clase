import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a la calculadora de la clase Main");

        menu();

    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");

        System.out.println("5. Salir");
        System.out.println("Seleccione una opción: ");

        int option = 0;
        try {
//            option = Integer.parseInt(System.console().readLine());
            option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    System.out.println("Seleccionó sumar");
                    break;
                default:
                    System.out.println("Opción no válida");
                    menu();
                    break;
            }
        } catch (NumberFormatException e) {
            System.out.println("Por favor, ingrese un número válido");
            menu();
        }

    }
}