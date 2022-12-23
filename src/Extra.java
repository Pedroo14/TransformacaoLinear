public class Extra {
    public static double[][] converterDouble(Vector vector) {
        double[][] vectorDouble = new double[vector.getVector().length][vector.getVector()[0].length];

        for(int contadorLinha = 0; contadorLinha < vector.getVector().length;contadorLinha++){
            for(int contadorColuna = 0; contadorColuna < vector.getVector()[0].length;contadorColuna++) {
                vectorDouble[contadorLinha][contadorColuna] = (double) vector.getVector()[contadorLinha][contadorColuna];
            }
        }

        return vectorDouble;
    }

    public static double[][] converterDoubleTranslate(Vector vector) {
        double[][] vectorDouble = new double[vector.getVector().length + 1][vector.getVector()[0].length];

        for(int contadorLinha = 0; contadorLinha < vector.getVector().length;contadorLinha++){
            for(int contadorColuna = 0; contadorColuna < vector.getVector()[0].length;contadorColuna++) {
                vectorDouble[contadorLinha][contadorColuna] = (double) vector.getVector()[contadorLinha][contadorColuna];
            }
        }

        return vectorDouble;
    }

    public static void printVector(double[][] vector) {
        for (int contadorLinha = 0; contadorLinha < vector.length; contadorLinha++) {
            for (int contadorColuna = 0; contadorColuna < vector[contadorLinha].length; contadorColuna++) {
                System.out.print(vector[contadorLinha][contadorColuna] + " ");
            }
            System.out.println();
        }
    }

    public static double[][] dot(double[][] vectorA, double[][] vectorB) {
        double[][] vectorAB = new double[vectorA.length][vectorB[0].length];

        for(int i=0; i<vectorAB.length; i++){
            for(int j=0; j<vectorAB[i].length; j++){
                for(int k=0; k<vectorA[i].length; k++){
                    vectorAB[i][j] += vectorA[i][k] * vectorB[k][j];
                }
            }
        }

        printVector(vectorAB);
        return vectorAB;
    }
}
