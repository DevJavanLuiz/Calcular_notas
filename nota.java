import java.util.Scanner;
public class nota {
    public static void main(String[] args) {
       double primeiraNota, segundaNota, terceiraNota, media;
         
    System.out.println("Seja Bem-Vindo!");
    System.out.println("Digete sua nota da primeira prova.");
    
    Scanner s = new Scanner (System.in);
    primeiraNota = s.nextDouble();

    System.out.println("Digete sua nota da segunda prova.");
    segundaNota = s.nextDouble();

    System.out.println("Digete sua nota da terceira prova.");
    terceiraNota = s.nextDouble();
 
    media = (primeiraNota + segundaNota + terceiraNota) / 3;

    System.out.println("Sua media desse unidade e:" + media);

}
}
