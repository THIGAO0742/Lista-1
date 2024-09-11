import java.util.Scanner;

public class ValidacaoCpf {
    public static void main(String[] args) {
        
    Scanner tec = new Scanner(System.in);
    String cpf;
    System.out.print("Digíte seu CPF ");
    cpf=tec.next();
    if(cpf.length()<=11){
        System.out.println("CPF VÁLIDO");
    }else{
        System.out.println("CPF INVÁLIDO");
    }//if
    
  }//main
}
