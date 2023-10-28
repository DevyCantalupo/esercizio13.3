public class esercizio13di3 {

    public static int[] eliminarDuplicados(int[] array) {
        int[] arregloSinDuplicados = new int[array.length];
        int contatore = 0;

        for (int elemento : array) {
            boolean esDuplicado = false;

            for (int i = 0; i < contatore; i++) {
                if (arregloSinDuplicados[i] == elemento) {
                    esDuplicado = true;
                    break;
                }
            }

            if (!esDuplicado) {
                arregloSinDuplicados[contatore] = elemento;
                contatore++;
            }
        }

        int[] resultado = new int[contatore];
        for (int i = 0; i < contatore; i++) {
            resultado[i] = arregloSinDuplicados[i];
        }

        return resultado;
    }

    public static void main(String[] args) {
        int[] arregloOriginal = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10};
        int[] arregloSinDuplicados = eliminarDuplicados(arregloOriginal);

        for (int elemento : arregloSinDuplicados) {
            System.out.println(elemento);
        }
    }

}
