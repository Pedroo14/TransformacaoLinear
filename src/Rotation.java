public class Rotation extends Extra {
    public double[][] rotation2D(Vector vector, double angle) {
        double[][] vectorDouble = converterDouble(vector);
        double x = vectorDouble[0][0];
        double y = vectorDouble[1][0];

        float sin;
        float cos;

        if(angle == 180 || angle == 360) { sin = 0; }

        else { sin = (float)Math.sin(Math.toRadians(angle)); }

        if(angle == 90 || angle == 270) { cos = 0; }

        else { cos = (float)Math.cos(Math.toRadians(angle)); }

        vectorDouble[0][0] = (cos * x) - (sin * y);
        vectorDouble[1][0] = (cos * y) + (sin * x);

        printVector(vectorDouble);
        return vectorDouble;
    }

    public double[][] rotation3DX (Vector vector, double angle) {
        double[][] vectorDouble = converterDouble(vector);
        double x = vectorDouble[0][0];
        double y = vectorDouble[1][0];
        double z = vectorDouble[2][0];

        float sin;
        float cos;

        if(angle == 180 || angle == 360) { sin = 0; }

        else { sin = (float)Math.sin(Math.toRadians(angle)); }

        if(angle == 90 || angle == 270) { cos = 0; }

        else { cos = (float)Math.cos(Math.toRadians(angle)); }

        vectorDouble[0][0] = x;
        vectorDouble[1][0] = (cos * y) - (sin * z);
        vectorDouble[2][0] = (cos * z) + (sin * y);

        printVector(vectorDouble);
        return vectorDouble;
    }

    public double[][] rotation3DY (Vector vector, double angle) {
        double[][] vectorDouble = converterDouble(vector);
        double x = vectorDouble[0][0];
        double y = vectorDouble[1][0];
        double z = vectorDouble[2][0];

        float sin;
        float cos;

        if(angle == 180 || angle == 360) { sin = 0; }

        else { sin = (float)Math.sin(Math.toRadians(angle)); }

        if(angle == 90 || angle == 270) { cos = 0; }

        else { cos = (float)Math.cos(Math.toRadians(angle)); }

        vectorDouble[0][0] = (cos * x) - (sin * y);
        vectorDouble[1][0] = y;
        vectorDouble[2][0] = (cos * z) - (sin * x);

        printVector(vectorDouble);
        return vectorDouble;
    }

    public double[][] rotation3DZ (Vector vector, double angle) {
        double[][] vectorDouble = converterDouble(vector);
        double x = vectorDouble[0][0];
        double y = vectorDouble[1][0];
        double z = vectorDouble[2][0];

        float sin;
        float cos;

        if(angle == 180 || angle == 360) { sin = 0; }

        else { sin = (float)Math.sin(Math.toRadians(angle)); }

        if(angle == 90 || angle == 270) { cos = 0; }

        else { cos = (float)Math.cos(Math.toRadians(angle)); }

        vectorDouble[0][0] = (cos * x) - (sin * y);
        vectorDouble[1][0] = (cos * y) + (sin * x);
        vectorDouble[2][0] = z;

        printVector(vectorDouble);
        return vectorDouble;
    }
}
