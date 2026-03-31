import java.util.Scanner;

public class Enfermera {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double sueldo, bonificacion = 0, total;
        char turno;

        System.out.print("Ingrese el sueldo base: ");
        sueldo = sc.nextDouble();

        System.out.print("Ingrese el turno (D = diurno, N = nocturno): ");
        turno = sc.next().charAt(0);

        switch (turno) {
            case 'D':
            case 'd':
                bonificacion = sueldo * 0.10;
                break;

            case 'N':
            case 'n':
                bonificacion = sueldo * 0.20;
                break;

            default:
                System.out.println("Error: turno invalido.");
                return;
        }

        total = sueldo + bonificacion;

        System.out.println("La bonificacion es: " + bonificacion);
        System.out.println("El total a pagar es: " + total);
    }
}