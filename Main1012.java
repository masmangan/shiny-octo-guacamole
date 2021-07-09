import java.util.Scanner;

public class Main1012
{
 
    
    public static void main(String[] args)
    {
        // Triangulo t1;
        // Circulo c1;
        // Trapezio tt1;
        Figura[] fs;
        double a;
        double b;
        double c;
        Scanner teclado;
        
        teclado = new Scanner(System.in);
        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();
        teclado.close();
        
        fs = new Figura[] {
                 new Triangulo(a, c),
                 new Circulo(c),
                 new Trapezio(a, b, c),
                 new Quadrado(a, b)
                 // altere aqui
            };
        // System.out.printf("TRIANGULO: %.3f\n", t1.getArea());
        // System.out.printf("CIRCULO: %.3f\n", c1.getArea());
        // System.out.printf("TRAPEZIO: %.3f\n", tt1.getArea());
        
        for (Figura f : fs) {
            System.out.printf("%s: %.3f\n", f.getClass().getName(), f.getArea());
        }
    }
}




