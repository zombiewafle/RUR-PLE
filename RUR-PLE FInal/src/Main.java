import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            System.out.println("Bienvenidos a RUR-ple en Java");
            System.out.println("");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("Capacidades del Robot:");
            System.out.println(" ");
            System.out.println("- El robot puede moverse , hacia los lados arriba, abajo, derecha e izquierda");
            System.out.println(" ");
            System.out.println("- Puede recoger las pilas de monedas");
            System.out.println(" ");
            System.out.println("- El Robot puede rotar hacia cualquiera de los lados antes mencionados");
            System.out.println(" ");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("Instrucciones:");
            System.out.println("- El robot debe de recoger todas las pilas de monedas, moviendose libremente por el mapa, teniendo cuidado de no chocar con ninguna pared");
            System.out.println(" ");
            System.out.println("- Se le mostrara un menu con las acciones que puede realizar, incluyendo las opciones de encender el juego, apagar, y el de salir ");
            System.out.println(" ");
            System.out.println("- Esparcidos por el mapa, se encontraran pilas de monedas, las cuales pueden tener distintos valores, los      cuales equivalen a monedas,seran mostrados por numeros, dependiendo de la cantidad de monedas que la pila contenga");
            System.out.println(" ");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("");
            System.out.println("----------------------------------------------------------------------------");
            Scanner input = new Scanner(System.in);
                Scanner sn = new Scanner(System.in);
                boolean salir = false;
                int opcion;
                while (!salir){
                    System.out.println("Menu\n");
                    System.out.println(" ");
                    System.out.println("\t1. Encender");
                    System.out.println("\t2. Salir ");
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println(" ");
                    try{
                        System.out.println("Escribe una de las opciones >>");
                        opcion = sn.nextInt();
                        switch (opcion){
                            case 1:
                                int opcionMenu2;
                                while (!salir){
                                    System.out.println("Menu\n");
                                    System.out.println(" ");
                                    System.out.println("\t1. Mover hacia arriba");
                                    System.out.println("\t2. Mover hacia abajo");
                                    System.out.println("\t3. Mover hacia la derecha");
                                    System.out.println("\t4. Mover hacia la izquierda");
                                    System.out.println("\t5. Salir");
                            }
                        }
                    }
                }
            }


    }
