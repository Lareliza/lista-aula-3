import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner notaAluno = new Scanner(System.in);
        double NPA = notaAluno.nextInt();
        double Notaprovisoria = (100-NPA);

        if(NPA>=60) {
            System.out.printf("O Aluno esta aprovado sem NP3");
        }
        if(NPA<30){
            System.out.println("O aluno esta reprovado e não tem direito a NP3");
        }
        if(NPA>=30 && NPA<60){
            System.out.printf("A nota do aluno é: "+ NPA );
            System.out.printf(" .A nota que ele precisa tirar é: "+ Notaprovisoria );
        }
        double NP3 = notaAluno.nextInt();

        if((NPA+NP3)/2>=50){
            System.out.println("O aluno esta aprovado");
        } else{
            System.out.println("O aluno esta reprovado");
        }


    }
}
