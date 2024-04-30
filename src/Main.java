

        import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int[] numeros = new int[5];

                System.out.println("porfa Ingrese 5 numeros:");

                // Leer los números y guardarlos en el arreglo
                for (int i = 0; i < 5; i++) {
                    numeros[i] = scanner.nextInt();
                }

                // Mostrar los números en el mismo orden introducido
                System.out.println("Los números q usted ingre0 son:");
                for (int i = 0; i < 5; i++) {
                    System.out.println(numeros[i]);
                }
            }
        }

