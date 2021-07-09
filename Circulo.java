
public class Circulo extends Figura
{    
    private static int contador;
    public double raio;
    
    public Circulo(double raio)
    {
        if (raio < 0.0)
        {
            throw new IllegalArgumentException();
        }
        this.raio = raio;
        contador = contador + 1;
    }

    public double getRaio()
    {
        return this.raio;
    }
    
    @Override
    public double getArea()
    {
        return 3.14159 * this.raio * this.raio;
    }    

}
