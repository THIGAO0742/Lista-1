import java.util.Scanner;

public class Velociadade {
    public static void main(String[] args) {
        
    Scanner tec = new Scanner(System.in); 
    double Vel, Temp, Dist;
    
    System.out.print("Distância pecorrida em metros: ");
    Dist=tec.nextDouble();
    System.out.print("O tempo gasto na distância pecorrida: ");
    Temp=tec.nextDouble();
    Vel= Dist/Temp;
    System.out.println("Velocidade (m/s): "+Vel);


    if(Vel< 5){
        System.out.println("Movimento lento");
    }else if(Vel>=5 && Vel<=15){
        System.out.println("Movimento Moderado");
    }else if(Vel>15){
        System.out.println("Movimento Rápido");
    }else if(Vel==0){
        System.out.println("Parado");
    }

    
    }//main
}
