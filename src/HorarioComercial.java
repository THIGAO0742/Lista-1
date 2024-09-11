import java.util.Scanner;

public class HorarioComercial {
    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);
        int HorasAtual,MinutoAtual;
        
        System.out.print("Qual o horário? ");
        HorasAtual=tec.nextInt();
        System.out.print("Qual o Minuto? ");
        MinutoAtual=tec.nextInt();
        System.out.println("/////////////////");
        System.out.println("São "+HorasAtual+":"+MinutoAtual);

        if(HorasAtual>= 9 && HorasAtual<=18){
            System.out.println("Estamos no Horário Comercial");
        } else{
            System.out.println("Não estamos no Horário Comercial");
        }

    }//main
}//class
