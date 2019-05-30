package actividadcalificada;

import java.util.Scanner;

public class ActividadCalificada {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nombre = "";
        String apellido = "";
        String mensajeFinal = "";
        String valorUsuario = "";
        int goles = 0;
        double sueldo = 0;
        int tgoles = 0;
        double psueldo = 0;
        double tsueldo = 0;
        int contador = 0;
        boolean opcion = true;
        mensajeFinal = String.format("%s%s\n", mensajeFinal, "Lista de Jugadores");
        mensajeFinal = String.format("%s%s\t\t%s\t%s\t\t%s\n", mensajeFinal,
                "nombre", "apellido", "goles", "sueldo");

        while (opcion == true) {

            System.out.println("Ingrese el nombre");
            nombre = sc.nextLine();

            System.out.println("Ingrese el apellido");
            apellido = sc.nextLine();

            System.out.println("Ingrese el nro de goles ");
            goles = sc.nextInt();
            
            tgoles = tgoles+goles;

            
            System.out.println("Ingrese el sueldo del jugador");
            sueldo = sc.nextDouble();
            
            psueldo = psueldo+sueldo;

            contador = contador + 1;

            
            mensajeFinal = String.format("%s%s\t\t%s\t\t%d\t\t%.2f\n"
                    , mensajeFinal, nombre, apellido, goles, sueldo);

            sc.nextLine(); // Limpiar Buffer

            System.out.println("Desea salir ingrese 'x' caso contrario presione enter para continuar ");
            valorUsuario = sc.nextLine();

            if (valorUsuario.equals("x")) {
                opcion = false;
            }

        }
        
        tsueldo = psueldo / contador;
        
        
        mensajeFinal = String.format("%sTotal de Goles %d\nPromedio de sueldo %.2f",
                     mensajeFinal, tgoles, tsueldo);
        
        System.out.printf("%s\n", mensajeFinal);
    }

}
