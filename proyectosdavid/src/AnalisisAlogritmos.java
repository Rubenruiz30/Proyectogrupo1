public class AnalisisAlogritmos {

import java.util.Arrays;
import java.util.Random;

    public class AnalisisAlgoritmo {

        public static void main(String[] args) {
            int[] numeros = generarArrayAleatorio(10, 1, 50);
            System.out.println("Array original: " + Arrays.toString(numeros));

            int resultado = procesarArray(numeros);

            System.out.println("Resultado final: " + resultado);
        }


        public static int[] generarArrayAleatorio(int tamaño, int min, int max) {
            int[] arr = new int[tamaño];
            Random rand = new Random();
            for (int i = 0; i < tamaño; i++) {
                arr[i] = rand.nextInt(max - min + 1) + min;
            }
            return arr;
        }


        public static int procesarArray(int[] arr) {
            int valorAcumulado = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    valorAcumulado += arr[i] / 2;
                } else {
                    if (arr[i] > 20) {
                        valorAcumulado += arr[i] * 2;
                    } else {
                        valorAcumulado -= arr[i];
                    }
                }


                if (i == arr.length / 2) {
                    System.out.println("Punto de control: " + valorAcumulado);
                }
            }


            if (valorAcumulado > 100) {
                valorAcumulado = valorAcumulado / 5;
            } else if (valorAcumulado < 0) {
                valorAcumulado = Math.abs(valorAcumulado);
            }

            return valorAcumulado;
        }
    }
}
