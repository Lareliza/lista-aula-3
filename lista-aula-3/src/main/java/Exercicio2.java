import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner valorentrada = new Scanner(System.in);
        int z1 = valorentrada.nextInt();
        int z2= valorentrada.nextInt();
        int z3 = valorentrada.nextInt();
        int total = z1+z2+z3;
        int media = total/3;

        System.out.println("Total:"+total);
        System.out.println("Media:"+media);
    }
}
