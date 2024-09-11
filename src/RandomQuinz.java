import java.util.Random;
import java.util.Scanner;

public class RandomQuinz {
    public static void main(String[] args) {
        Random numRandom = new Random();
        int numAle, numP1=0;
        boolean ok=false;
        numAle=numRandom.nextInt(100)+1;
        System.out.println("ACERTE O NÚMERO ALEÁTORIO");

        while ( ok == false) {
            Scanner tec = new Scanner(System.in);
            System.out.println("///////////////////////");
            System.out.print("Sua escolha: ");
            numP1=tec.nextInt();
            if (numP1>0 && numP1<101) {
                if(numP1==numAle){
                System.out.println("PARABÉNS!!");
                System.out.println("Você Acertou");
                ok = true;
                }else if(numP1<numAle){
                    System.out.println("O NÚMERO QUE VOCÊ DIGITOU É MENOR DO QUE O NÚMERO CORRETO");
                }else if(numP1>numAle){
                    System.out.println("O NÚMERO QUE VOCÊ DIGITOU É MAIOR DO QUE O NÚMERO CORRETO");
                }
            } else {
                System.out.println("TENTE NOVAMENTE!!");
            }//IF
        }//WHILE
        
    }
}