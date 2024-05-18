import java.util.Scanner;

public class imcCalculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Calculadora de IMC (Índice de Massa Corporal)");
            System.out.println("Por favor, insira seu peso (em quilogramas):");
            double peso = scanner.nextDouble();

            System.out.println("Agora, insira sua altura (em metros):");
            double altura = scanner.nextDouble();

            double imc = calcularIMC(peso, altura);

            System.out.println("Seu IMC é: " + imc);
            if (imc < 18.5) {
                System.out.println("Seu IMC indica que está abaixo do peso.");
            } else if (imc >= 18.5 && imc < 25) {
                System.out.println("Seu IMC indica que está com o peso normal.");
            } else if (imc >= 25 && imc < 30) {
                System.out.println("Seu IMC indica que está com sobrepeso.");
            } else {
                System.out.println("Seu IMC indica que está com obesidade.");
            }

            System.out.println("Classificações gerais:");

            System.out.println("Abaixo do peso: IMC < 18.5");
            System.out.println("Peso normal: 18.5 <= IMC < 25");
            System.out.println("Sobrepeso: 25 <= IMC < 30");
            System.out.println("Obesidade: IMC >= 30");

            scanner.close();
        }

        public static double calcularIMC(double peso, double altura) {
            return peso / (altura * altura);
        }
    }


