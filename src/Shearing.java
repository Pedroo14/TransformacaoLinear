public class Shearing extends Extra {
    public double[][] shearing(Vector vector, double kx, double ky) {
        double[][] vectorDouble = converterDouble(vector);
        double[][] maxX = {
                {1,kx},
                {0,1}
        };
        double[][] maxY = {
                {1,0},
                {ky,1}
        };

        if (kx != 0) {
            vectorDouble = dot(maxX, vectorDouble);
        }

        if (ky != 0) {
            vectorDouble = dot(maxY, vectorDouble);
        }

        return vectorDouble;
    }
}
