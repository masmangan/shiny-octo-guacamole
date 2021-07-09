
public class Trapezio extends Figura
{
    private double base1;
    private double base2;
    private double altura;

    public Trapezio(double base1, double base2, double altura)
    {
        if (base1 < 0.0)
        {
            throw new IllegalArgumentException();
        }        
        if (base2 < 0.0)
        {
            throw new IllegalArgumentException();
        } 
        if (altura < 0.0)
        {
            throw new IllegalArgumentException();
        }        
        this.base1 = base1;
        this.base2 = base2;
        this.altura = altura;
    }

    public double getBase1()
    {
        return base1;
    }

    public double getBase2()
    {
        return base2;
    }
    
    public double getAltura()
    {
        return altura;
    }    
    
    @Override    
    public double getArea()
    {
        return ((base1 + base2) / 2.0) * altura;
    }
}
