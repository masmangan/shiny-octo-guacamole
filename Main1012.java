import java.util.Scanner;

public class Main1012
{
    private Main1012()
    { 
    }
    
    public static void main(String[] args)
    {
        Triangulo t1;
        Circulo c1;
        Trapezio tt1;
        double a;
        double b;
        double c;
        Scanner teclado;
        
        teclado = new Scanner(System.in);
        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();
        teclado.close();
        
        t1 = new Triangulo(a, c);
        c1 = new Circulo(c);
        tt1 = new Trapezio(a, b, c);
        
        System.out.printf("TRIANGULO: %.3f\n", t1.getArea());
        System.out.printf("CIRCULO: %.3f\n", c1.getArea());
        System.out.printf("TRAPEZIO: %.3f\n", tt1.getArea());
    }
}
