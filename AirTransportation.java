
/**
 * Escreva uma descrição da classe AirTransportation aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class AirTransportation extends Transport
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String name;
    private int numberOfContainers;
    private static final double FEES = 4.0;
    

    /**
     * Construtor para objetos da classe AirTransportation
     */
    public AirTransportation(String name, int numberOfContainers)
    {
        this.name = name;
        this.numberOfContainers = numberOfContainers;
    }

    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */
    public String getName()
    {
        return name;
    }
    public int getNumberOfContainers()
    {
        return numberOfContainers;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setNumberOfContainers(int numberOfContainers)
    {
        if(numberOfContainers >= 0)
        this.numberOfContainers = numberOfContainers;
    }
}
