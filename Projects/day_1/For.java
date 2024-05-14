import java.util.Scanner;

public class For {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo ao timer!");
        System.out.println("Digite um número de minutos para o timer:");

        int initialValueInMinutes = 0;

        try {
            initialValueInMinutes = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
        }

        
        System.out.println("Você configurou essa contagem regressiva para iniciar com o número: " + initialValueInMinutes);
        System.out.println("Iniciando contagem!");

        
        int initialValueInSeconds = initialValueInMinutes * 60;

        
        for( int i = initialValueInSeconds; i > 0; i-- ){
            if(i > 60){
                System.out.println("Valor atual do contador: " + i / 60 + " minutos e " + i % 60 + " segundos.");
            } else if(i == 60) {
                System.out.println("Valor atual do contador: 1 minuto." );
            } else if (i < 60) {
                System.out.println("Valor atual do contador: " + i + " segundos.");

            }

            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Ocorreu um erro ao pausar o timer: " + e.getMessage());
            }
        }

        
        System.out.println("Contagem finalizada!");

        sc.close();
    }
}
