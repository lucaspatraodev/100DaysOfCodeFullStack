import java.util.Scanner;

public class For {
    public static void main(String[] args) {

        // Scanner para leitura de dados
        Scanner sc = new Scanner(System.in);

        //  Mensagens de bem vindo e isntruções para o input do user
        System.out.println("Bem vindo ao timer!");
        System.out.println("Digite um número de minutos para o timer:");

        // Variável com valor inicial em minutos (mudada depois)
        int initialValueInMinutes = 0;

        try {
            // Atualização do valor por meio do scanner
            initialValueInMinutes = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
        }

        //  Mensagem de aviso de tempo escolhido pelo user
        System.out.println("Você configurou essa contagem regressiva para iniciar com o número: " + initialValueInMinutes);
        System.out.println("Iniciando contagem!");

        // Conversão para segundos
        int initialValueInSeconds = initialValueInMinutes * 60;

        // For responsável pelo timer
        for( int i = initialValueInSeconds; i > 0; i-- ){
            // Estrutura condicional para mudar print para ficar mais correto ao user
            if(i > 60){
                System.out.println("Valor atual do contador: " + i / 60 + " minutos e " + i % 60 + " segundos.");
            } else if(i == 60) {
                System.out.println("Valor atual do contador: 1 minuto." );
            } else if (i < 60) {
                System.out.println("Valor atual do contador: " + i + " segundos.");

            }

            // Linhas de código responsáveis pela pausa de segundos (funcionamento do timer segundo a segundo)
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Ocorreu um erro ao pausar o timer: " + e.getMessage());
            }
        }

        // Mensagem de fim!!!!!!!
        System.out.println("Contagem finalizada!!");

        sc.close();
    }
}
