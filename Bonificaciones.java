import java.util.Scanner;

public class Bonificaciones {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numHijos, anos_servi;
        double monto = 0;

        System.out.print("Ingrese el numero de hijos: ");
        numHijos = sc.nextInt();

        System.out.print("Ingrese los años de servicio: ");
        anos_servi = sc.nextInt();

        // Bonificación por hijos
        monto = monto + (300 * numHijos);

        // Bonificación por antigüedad usando switch
        switch (anos_servi > 5 ? 1 : 0) {
            case 1:
                monto = monto + 800;
                break;
            case 0:
                monto = monto + 500;
                break;
            default:
                System.out.println("Error en los datos.");
        }

        System.out.println("El monto total a pagar es: " + monto + " Cop.");
    }
}