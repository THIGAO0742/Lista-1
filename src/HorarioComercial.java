import java.util.Scanner;

public class HorarioComercial {
    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);
        int HorasAtual=0,MinutoAtual=0;
        boolean HorasVF = false;
        boolean MinVF = false;

        while (HorasVF==false) {
            System.out.print("Qual o horário? ");
            HorasAtual=tec.nextInt();
            if(HorasAtual>=0 && HorasAtual<=23){
                HorasVF=true;
            }else if(HorasAtual<0 && HorasAtual>23){
                System.out.println("Digite o Horario corretamente...");
            }
        }
        while (MinVF==false) {
            System.out.print("Qual o horário? ");
            HorasAtual=tec.nextInt();
            if(MinutoAtual>=0 && MinutoAtual<=59){
                MinVF=true;
            }else if(HorasAtual<0 && HorasAtual>59){
                System.out.println("Digite o Horario corretamente...");
            }
        }
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
