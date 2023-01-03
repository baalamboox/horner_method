import java.util.Scanner;
public class HornerMethod {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        System.out.println("\nMetodo de Horner\n");
        System.out.println("\tD(x)\n\t----\n\td(x)\n");
        System.out.print("Ingrese el grado de D(x): ");
        int gDx = inputData.nextInt();
        System.out.print("Ingresa el grado de d(x): ");
        int gdx = inputData.nextInt();
        hornerMethod(gDx, gdx);
    }
    public static void hornerMethod(int gDx, int gdx) {
        Scanner inputData = new Scanner(System.in);
        int[] Dx = new int[gDx + 1];
        int[] dx = new int[gdx + 1];
        System.out.println("\nCoeficientes de D(x)");
        for(int i = 0; i < Dx.length; i++) {
            System.out.print("x^" + ((Dx.length - 1) - i) + ": ");
            Dx[i] = inputData.nextInt();
            if((i == (Dx.length - 2))) {
                System.out.print("  a: ");
                Dx[i + 1] = inputData.nextInt(); 
                break;
            }
        }
        System.out.println("Coeficientes de d(x)");
        for(int i = 0; i < dx.length; i++) {
            System.out.print("x^" + ((dx.length - 1) - i) + ": ");
            dx[i] = inputData.nextInt();
            if((i == (dx.length - 2))) {
                System.out.print("  a: ");
                dx[i + 1] = inputData.nextInt();
                break;
            }
        }
        int[] ndx = new int[dx.length];
        for(int i = 1; i < ndx.length; i++) {
            ndx[i] = (-1 * dx[i]);
        }
        int[] Qx = new int[(Dx.length - (Dx.length - dx.length))];
        int[] Rx = new int[(Dx.length - dx.length)];
        for(int i = 0; i < Qx.length; i++) {
            Qx[i] = (Dx[i] / dx[0]);
            for(int j = 1; j < ndx.length; j++) {
                Dx[j] = ((Qx[i] * ndx[j]) + Dx[j]);
            }
        }
        System.out.println("Resutaldo");
        for(int i = 0; i < Qx.length; i++) {
            System.out.println("Q(x)= " + Qx[i]);
        }
        for(int i = 0; i < Rx.length; i++) {
            System.out.println("R(x)= " + Rx[i]);
        }
    }
}