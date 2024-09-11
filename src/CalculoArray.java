import java.util.Scanner;

public class CalculoArray {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int num[] = new int[5];
        int soma = 0;
        for(int i=0;i<num.length;i++){
            System.out.print("Digite um número: ");
            num[i]=tec.nextInt();
        }
        for(int i=0;i<num.length;i++){
            soma += num[i];
        }
        System.out.println("A soma de todos os numeros  da arry é "+soma);
    }//main
}