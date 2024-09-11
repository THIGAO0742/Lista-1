import java.util.Scanner;

public class Banco {
   
  
    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);
        float valorEmprestimo,valorParcela,salario,portcetagem;
        int parcelas;
        

        System.out.print("Digite o valor que deseja para o emprestimo: ");
        valorEmprestimo= tec.nextFloat();
        System.out.print("Quantas parcelas você deseja para quitar o débito?");
        parcelas=tec.nextInt();
        System.out.print("Valor do seu salário:");
        salario=tec.nextFloat();
        valorParcela = valorEmprestimo/parcelas;
        if(valorParcela*0.30 == salario*030) {
            System.out.println("Emprestimo aprovado");
            System.out.println("Valor do emprestimo: "+valorEmprestimo);
            System.out.println("Parcelas: "+parcelas);
            System.out.println("Valor das parcelas: "+ valorParcela);
            System.out.println("Valor do Salario: "+salario);
        }else{
            System.out.println("Emprestimo Reprovado");
            System.out.println("Valor do emprestimo: "+valorEmprestimo);
            System.out.println("Parcelas: "+parcelas);
            System.out.println("Valor das parcelas: "+ valorParcela);
            System.out.println("Valor do Salario: "+salario);
        }
    
    }//main
}
