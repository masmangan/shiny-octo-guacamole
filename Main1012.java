import java.util.Scanner;

public class Main1012
{
    private Main1012()
    {
        
    }
    
    public static void main(String[] args)
    {
        Circulo c1;
        double a;
        double b;
        double c;
        Scanner teclado;
        
        teclado = new Scanner(System.in);
        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();
        teclado.close();
        
        c1 = new Circulo(c);
        
        System.out.printf("CIRCULO: %.3f\n", c1.getArea());
    }
}
