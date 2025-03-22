import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nombre vendedor:");
        String nombre = scanner.nextLine();

        System.out.println("Cantidad de productos vendidos:");
        int producto = scanner.nextInt();

        System.out.println("Ingrese valor producto 1:");
        double producto1 = scanner.nextDouble();

        System.out.println("Ingrese valor producto 2:");
        double producto2 = scanner.nextDouble();

        System.out.println("Ingrese valor producto 3:");
        double producto3 = scanner.nextDouble();

        System.out.println("Ingrese valor producto 4:");
        double producto4 = scanner.nextDouble();

        System.out.println("Ingrese valor producto 5:");
        double producto5 = scanner.nextDouble();

        System.out.println("Ingrese valor producto 6:");
        double producto6 = scanner.nextDouble();

        System.out.println("Ingrese valor producto 7:");
        double producto7 = scanner.nextDouble();

        double s1 = 0;

        if (producto1 >= 100000) {
            s1 = s1 + (producto1 * 0.10);
        } else {
            s1 = s1 + (producto1 * 0.05);
        }

        if (producto2 >= 100000) {
            s1 = s1 + (producto2 * 0.10);
        } else {
            s1 = s1 + (producto2 * 0.05);
        }

        if (producto3 >= 100000) {
            s1 = s1 + (producto3 * 0.10);
        } else {
            s1 = s1 + (producto3 * 0.05);
        }

        if (producto4 >= 100000) {
            s1 = s1 + (producto4 * 0.10);
        } else {
            s1 = s1 + (producto4 * 0.05);
        }

        if (producto5 >= 100000) {
            s1 = s1 + (producto5 * 0.10);
        } else {
            s1 = s1 + (producto5 * 0.05);
        }

        if (producto6 >= 100000) {
            s1 = s1 + (producto6 * 0.10);
        } else {
            s1 = s1 + (producto6 * 0.05);
        }

        if (producto7 >= 100000) {
            s1 = s1 + (producto7 * 0.10);
        } else {
            s1 = s1 + (producto7 * 0.05);
        }

        double tt = producto1 + producto2 + producto3 + producto4 + producto5 + producto6 + producto7;
        double ss = (double) (s1 + 1000000);

        System.out.println("Vendedor: " + nombre);
        System.out.println("Total ventas: " + (int)tt);
        System.out.println("Comisiones: " + (int)s1);
        System.out.println("Salario total: " + (int)ss);
        scanner.close();
    }
}
