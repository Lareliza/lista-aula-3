import java.util.Random;
import java.util.Scanner;

public  class  Exercicio6 {

    public  static  void  main ( String [] args ) {

        Scanner valorTeclado =  new  Scanner (System.in);
        Random rand =  new Random();

        int n, a;
        n = rand.nextInt( 10 ) +  1 ;

        do {
            System.out.println( " Qual e o numero? " );
            a = valorTeclado.nextInt(); if (a < n)
                System.out.println( " E maior que este numero" );
            else if (a > n)
                System.out.println( " E menor que este numero " );
        } while (n != a);
        System.out.println( " Parabéns, este e o numero :)! " );



        valorTeclado.close();
    }
}