public class Translate extends Extra {
    public double[][] translate2D(Vector vector, double dx, double dy) {
        double[][] vectorDouble = converterDoubleTranslate(vector);

        vectorDouble[2][0] = 1;

        double[][] trans = {
                {1,0,dx},
                {0,1,dy},
        };

        return dot(trans, vectorDouble);
    }

    public double[][] translate3D(Vector vector, double dx, double dy, double dz) {
        double[][] vectorDouble = converterDoubleTranslate(vector);

        vectorDouble[3][0] = 1;

        double[][] trans = {
                {1,0,0,dx},
                {0,1,0,dy},
                {0,0,1,dz},
        };

        return dot(trans, vectorDouble);
    }
}
