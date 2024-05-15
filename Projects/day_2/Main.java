import java.util.Scanner;

class Triangle {
    double a;
    double b;
    double c;
}

public class Main {
    public static void main(String[] args) {
        // Scanner para leitura de dados
        Scanner sc = new Scanner(System.in);

        // Criação das variáveis dos triângulos
        Triangle x, y;

        // Instanciação dos triângulos
        x = new Triangle();
        y = new Triangle();


        // Leitura de dados do triângulo X
        System.out.println("Enter the measures of A side of triangle X:");
        x.a = sc.nextDouble();

        System.out.println("Enter the measures of B side of triangle X:");
        x.b = sc.nextDouble();

        System.out.println("Enter the measures of C side of triangle X:");
        x.c = sc.nextDouble();

        // Leitura de dados do triângulo Y
        System.out.println("Enter the measures of A side of triangle Y:");
        y.a = sc.nextDouble();

        System.out.println("Enter the measures of B side of triangle Y:");
        y.b = sc.nextDouble();

        System.out.println("Enter the measures of C side of triangle Y:");
        y.c = sc.nextDouble();

        // Definição de semiperímetro do triângulo X
        double sx = (x.a + x.b + x.c) / 2.0;

        // Definição de semiperímetro do triângulo X
        double sy = (y.a + y.b + y.c) / 2.0;

        // Cálculo de ambas áreas:
        double areaX = Math.sqrt(sx * (sx - x.a) * (sx - x.b) * (sx - x.c));
        double areaY = Math.sqrt(sy * (sy - y.a) * (sy - y.b) * (sy - y.c));

        // Determinação e exibição do triângulo com a maior área
        String largerTriangleArea;
        System.out.println("Triangle X area = " + areaX);
        System.out.println("Triangle Y area = " + areaY);

        if(areaX > areaY){
            largerTriangleArea = "X";
        } else if (areaY > areaX){
            largerTriangleArea = "Y";
        } else {
            largerTriangleArea = "Well, unbelievely theyre equal... hahaha ";
            System.out.println(largerTriangleArea);
            sc.close();
            return;
        }

        System.out.println("The Triangle " + largerTriangleArea + " has a larger area!");

        sc.close();
    }
}
