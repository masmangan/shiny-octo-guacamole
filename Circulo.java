
public class Circulo
{
    private double raio;
    
    public Circulo(double raio)
    {
        if (raio < 0.0)
        {
            throw new IllegalArgumentException();
        }
        this.raio = raio;
    }

    public double getRaio()
    {
        return this.raio;
    }
    
    public double getArea()
    {
        return 3.14159 * this.raio * this.raio;
    }    

}
