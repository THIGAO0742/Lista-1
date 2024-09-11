import java.util.Scanner;

public class SalarioBonus {
    public static void main(String[] args) {
         Scanner tec = new Scanner(System.in);
        int avaliaca;
        double salario,SalarioBonus=0;

        System.out.print("Salaario do Funiconário:");
        salario= tec.nextDouble();
        System.out.print("Avaliação do Funcionario:");
        avaliaca=tec.nextInt();
        System.out.println("**************************");
        if(avaliaca <= 25 && avaliaca>=0){
            System.out.println("Funcionario INSATISFATÓRIO");
            System.out.println("Nao recebeu bônus");
        } else if(avaliaca >25  && avaliaca <=50 ){
            System.out.println("Funcionario REGULAR");
            System.out.println("Bônus de 5% no salário!!");
            SalarioBonus += salario * 0.05;
        }else if(avaliaca >50  && avaliaca <=75 ){
            System.out.println("Funcionario BOM");
            System.out.println("Bônus de 10% no salário!!");
            SalarioBonus += salario * 0.10;
        }else if(avaliaca >75  && avaliaca <=100 ){
            System.out.println("Funcionario OTIMO");
            System.out.println("Bônus de 20% no salário!!");
            SalarioBonus += salario * 0.20;
        } else { 
            System.out.println("AVALIÇÃO INCORRETA");
        }
        System.out.println("**************************");
        System.out.println("Salário Base : "+salario);
        System.out.println("Salario + Bônus : "+SalarioBonus);
    }//main
}
