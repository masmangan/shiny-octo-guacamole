
public class Triangulo extends Figura
{
    private double base;
    private double altura;

    public Triangulo(double base, double altura)
    {
        if (base < 0.0)
        {
            throw new IllegalArgumentException();
        }        
        if (altura < 0.0)
        {
            throw new IllegalArgumentException();
        } 
        this.base = base;
        this.altura = altura;
    }

    public double getBase()
    {
        return base;
    }

    public double getAltura()
    {
        return altura;
    }    
    
    @Override
    public double getArea()
    {
        return (base * altura) / 2.0;
    }    
    
}
