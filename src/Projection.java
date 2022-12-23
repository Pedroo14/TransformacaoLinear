public class Projection extends Extra {
    public double[][] projection2DX(Vector vector) {
        double[][] vectorDouble = converterDouble(vector);
        double[][] transformation = {
                {1,0},
                {0,0}
        };
        return dot(transformation, vectorDouble);
    }

    public double[][] projection2DY(Vector vector) {
        double[][] vectorDouble = converterDouble(vector);
        double[][] transformation = {
                {0,0},
                {0,1}
        };
        return dot(transformation, vectorDouble);
    }

    public double[][] projection3DX(Vector vector) {
        double[][] vectorDouble = converterDouble(vector);
        double[][] transformation = {
                {1,0,0},
                {0,0,0},
                {0,0,1}
        };
        return dot(transformation, vectorDouble);
    }

    public double[][] projection3DY(Vector vector) {
        double[][] vectorDouble = converterDouble(vector);
        double[][] transformation = {
                {0,0,0},
                {0,1,0},
                {0,0,1}
        };
        return dot(transformation, vectorDouble);
    }

    public double[][] projection3DZ(Vector vector) {
        double[][] vectorDouble = converterDouble(vector);
        double[][] transformation = {
                {1,0,0},
                {0,0,0},
                {0,0,1}
        };
        return dot(transformation, vectorDouble);
    }
}
