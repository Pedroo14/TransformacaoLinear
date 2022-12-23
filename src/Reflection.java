public class Reflection extends Extra {
    public double[][] reflection2DX(Vector vector) {
        double[][] vectorDouble = converterDouble(vector);

        double[][] reflection = {
                {1,0},
                {0,-1}
        };

        return dot(reflection, vectorDouble);
    }

    public double[][] reflection2DY(Vector vector) {
        double[][] vectorDouble = converterDouble(vector);

        double[][] reflection = {
                {-1,0},
                {0,1}
        };

        return dot(reflection, vectorDouble);
    }

    public double[][] reflection3DX(Vector vector) {
        double[][] vectorDouble = converterDouble(vector);

        double[][] reflection = {
                {1,0,0},
                {0,-1,0},
                {0,0,-1}
        };

        return dot(reflection, vectorDouble);
    }

    public double[][] reflection3DY(Vector vector) {
        double[][] vectorDouble = converterDouble(vector);

        double[][] reflection = {
                {-1,0,0},
                {0,1,0},
                {0,0,-1}
        };

        return dot(reflection, vectorDouble);
    }

    public double[][] reflection3DZ(Vector vector) {
        double[][] vectorDouble = converterDouble(vector);

        double[][] reflection = {
                {-1,0,0},
                {0,-1,0},
                {0,0,1}
        };

        return dot(reflection, vectorDouble);
    }
}
