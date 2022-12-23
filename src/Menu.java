import java.io.IOException;
import java.util.Scanner;

public class Menu {
    Scanner leitor = new Scanner(System.in);
    Vector vetor;
    Projection projection = new Projection();
    Reflection reflection = new Reflection();
    Rotation rotation = new Rotation();
    Shearing shearing = new Shearing();
    Translate translate = new Translate();
    int respostaMenuVetor;

    public Vector criarVector() throws IOException {
        Scanner leitor = new Scanner(System.in);
        Menu menu = new Menu();

        int rows;
        int[] elements;

        System.out.println("=============================== Criar Vetor ================================");
        System.out.print("Digite a dimensão do seu vetor: ");
        rows = leitor.nextInt();

        elements = new int[rows];

        System.out.println("Digite os elementos do seu vetor (um em cada linha):");
        for(int contador = 0; contador<rows;contador++) {
            elements[contador] = (leitor.nextInt());
        }

        vetor = new Vector(rows,elements);
        System.in.read();

        if(rows == 2) {
            menu2D();
        }

        if(rows == 3) {
            menu3D();
        }

        return vetor;
    }


    public void menu2D() throws IOException {

        System.out.println("======================= Menu Duas Dimensões - Métodos ========================");
        System.out.println("Para continuar, escolha o próximo passo:");
        System.out.println("1.Projection2DX");
        System.out.println("2.Projection2DY");
        System.out.println("3.Reflection2DX");
        System.out.println("4.Reflection2DY");
        System.out.println("5.Rotation2D");
        System.out.println("6.Shearing");
        System.out.println("7.Translate2D");
        System.out.println();
        System.out.print("Sua resposta: ");
        respostaMenuVetor = leitor.nextInt();
        System.out.println();

        menuResposta2D();
    }

    public void menuResposta2D() throws IOException {
        if(respostaMenuVetor == 1) {
            System.out.println("=============================== Projection 2DX ===============================");
            projection.projection2DX(vetor);
        }

        if(respostaMenuVetor == 2) {
            System.out.println("=============================== Projection 2DY ===============================");
            projection.projection2DY(vetor);
        }

        if(respostaMenuVetor == 3) {
            System.out.println("=============================== Reflection 2DX ===============================");
            reflection.reflection2DX(vetor);
        }

        if(respostaMenuVetor == 4) {
            System.out.println("=============================== Reflection 2DY ===============================");
            reflection.reflection2DY(vetor);
        }

        if(respostaMenuVetor == 5) {
            System.out.println("================================ Rotation 2D =================================");
            System.out.print("Digite o número do angulo de rotação (double): ");
            double angle = leitor.nextDouble();
            rotation.rotation2D(vetor,angle);
        }

        if(respostaMenuVetor == 6) {
            System.out.println("================================== Shearing ==================================");
            System.out.print("Digite o número do kx (double): ");
            double kx = leitor.nextDouble();
            System.out.print("Digite o número do ky (double): ");
            double ky = leitor.nextDouble();
            shearing.shearing(vetor,kx,ky);
        }

        if(respostaMenuVetor == 7) {
            System.out.println("================================ Translate 2D ================================");
            System.out.print("Digite o número do dx (double): ");
            double dx = leitor.nextDouble();
            System.out.print("Digite o número do dy (double): ");
            double dy = leitor.nextDouble();
            translate.translate2D(vetor,dx,dy);
        }

        System.in.read();
        menu2D();
    }

    public void menu3D() throws IOException {
        System.out.println("======================= Menu Três Dimensões - Métodos ========================");
        System.out.println("Para continuar, escolha o próximo passo:");
        System.out.println("1.Projection3DX");
        System.out.println("2.Projection3DY");
        System.out.println("3.Projection3DZ");
        System.out.println("4.Reflection3DX");
        System.out.println("5.Reflection3DY");
        System.out.println("6.Reflection3DZ");
        System.out.println("7.Rotation3DX");
        System.out.println("8.Rotation3DY");
        System.out.println("9.Rotation3DZ");
        System.out.println("10.Translate3D");
        System.out.println();
        System.out.print("Sua resposta: ");
        respostaMenuVetor = leitor.nextInt();
        System.out.println();

        menuResposta3D();
    }

    public void menuResposta3D() throws IOException {
        if(respostaMenuVetor == 1) {
            System.out.println("=============================== Projection 3DX ===============================");
            projection.projection3DX(vetor);
        }

        if(respostaMenuVetor == 2) {
            System.out.println("=============================== Projection 3DY ===============================");
            projection.projection3DY(vetor);
        }

        if(respostaMenuVetor == 3) {
            System.out.println("=============================== Projection 3DZ ===============================");
            projection.projection3DZ(vetor);
        }

        if(respostaMenuVetor == 4) {
            System.out.println("=============================== Reflection 3DX ===============================");
            reflection.reflection3DX(vetor);
        }

        if(respostaMenuVetor == 5) {
            System.out.println("=============================== Reflection 3DY ===============================");
            reflection.reflection3DY(vetor);
        }

        if(respostaMenuVetor == 6) {
            System.out.println("=============================== Reflection 3DZ ===============================");
            reflection.reflection3DZ(vetor);
        }

        if(respostaMenuVetor == 7) {
            System.out.println("================================ Rotation 3DX ================================");
            System.out.print("Digite o número do angulo de rotação (double): ");
            double angle = leitor.nextDouble();
            rotation.rotation3DX(vetor,angle);
        }

        if(respostaMenuVetor == 8) {
            System.out.println("================================ Rotation 3DY ================================");
            System.out.print("Digite o número do angulo de rotação (double): ");
            double angle = leitor.nextDouble();
            rotation.rotation3DY(vetor,angle);
        }

        if(respostaMenuVetor == 9) {
            System.out.println("================================ Rotation 3DZ ================================");
            System.out.print("Digite o número do angulo de rotação (double): ");
            double angle = leitor.nextDouble();
            rotation.rotation3DZ(vetor,angle);
        }

        if(respostaMenuVetor == 10) {
            System.out.println("================================ Translate 3D ================================");
            System.out.print("Digite o número do dx (double): ");
            double dx = leitor.nextDouble();
            System.out.print("Digite o número do dy (double): ");
            double dy = leitor.nextDouble();
            System.out.print("Digite o número do dz (double): ");
            double dz = leitor.nextDouble();
            translate.translate3D(vetor,dx,dy,dz);
        }

        System.in.read();
        menu3D();
    }

}
