
import java.util.Scanner;

public class DesempenhoFuncional {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int avaliaca;

        System.out.print("Avaliação do Funcionario:");
        avaliaca=tec.nextInt();

        if(avaliaca <= 25 && avaliaca>=0){
            System.out.println("Funcionario INSATISFATÓRIO");
        } else if(avaliaca >25  && avaliaca <=50 ){
            System.out.println("Funcionario REGULAR");

        }else if(avaliaca >50  && avaliaca <=75 ){
            System.out.println("Funcionario BOM");

        }else if(avaliaca >75  && avaliaca <=100 ){
            System.out.println("Funcionario OTIMO");

        } else { 
            System.out.println("AVALIÇÃO INCORRETA");

        }

   
    }//main

}
