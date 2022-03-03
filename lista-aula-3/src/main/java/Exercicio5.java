import java.util.Random;
import java.util.Scanner;

public  class  Exercicio5 {

    public  static  void  main ( String [] args ) {

        Scanner valorTeclado =  new  Scanner (System.in);
        Random rand =  new Random();

        int n, a;
        n = rand.nextInt( 10 ) +  1 ;

        do {
            System.out.println( " Qual e o numero? " );
            a = valorTeclado.nextInt();
            if (a != n)
                System.out.println( " Mais sorte da próxima vez :( " );

        } while (n != a);

        System.out.println( " Parabéns, este e o numero :) " );

        // Para fechar o Scanner, após seu uso
        valorTeclado.close();

    }
}