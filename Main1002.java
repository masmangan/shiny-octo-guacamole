import java.util.Scanner;

public class Main1002
{

    private Main1002()
    {
    }

    public static void main(String[] args)
    {
        Circulo c1;
        double r;
        Scanner teclado;
        
        teclado = new Scanner(System.in);
        r = teclado.nextDouble();
        teclado.close();
        
        c1 = new Circulo(r);
        
        System.out.printf("A=%.4f\n", c1.getArea());
    }
}
