import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int blocos = 0;
        /*Armazena o valor da variável blocos, e faz com que o
        usuário digite um número entre 0 e 8 para sair do loop*/
        while (blocos <= 0 || blocos > 8){
            System.out.println("Digite o número de blocos desejado: ");
            blocos = scanner.nextInt();
            if (blocos <= 0 || blocos > 8){
                System.out.printf("Número de blocos inválido! Digite um número entre 0 e 8!\n");
            }
        }

        //Cria um loop para repetir a saída das Hashtags
        for (int i = 1; i <= blocos; i++) {
            //Printa os espaços antes das hashtags, dependendo do nº de linhas
            for (int j = 0; j < blocos - i; j++){
                System.out.printf(" ");
            }
            //Printa as Hashtags
            for (int f = 0; f < i; f++){
                System.out.printf("#");
            }
            //Printa o espaço, para repetir isso na outra linha
            System.out.printf(" ");
            for (int c = 0; c < i; c++){
                System.out.printf("#");
            }
            //Passa para a linha de baixo
            System.out.printf("\n");
        }

    }
}
