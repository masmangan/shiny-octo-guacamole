
/**
 * Escreva uma descrição da classe Quadrado aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Quadrado extends Figura
{
    private double base;
    private double altura;

    /**
     * Construtor para objetos da classe Quadrado
     */
    public Quadrado(double base, double altura)
    {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double getArea()
    {
        // escreva seu código aqui
        return base * altura;
    }
}
