import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner alunos = new Scanner(System.in);
        int nalunos = alunos.nextInt();

        switch (nalunos){
            case 10:
            System.out.println("A sala a ser utilizada é a l-15");
            break;


            case 20:
            System.out.println("A sala a ser utilizada é a l-15");
            break;

            case 30:
            System.out.println("A sala a ser utilizada é a l-22");
            break;

            default :
                System.out.println("Valor inválido");
        }


    }
}
