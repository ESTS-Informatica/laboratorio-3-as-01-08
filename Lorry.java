
/**
 * Escreva uma descrição da classe Lorry aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Lorry extends GroundTransportation
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int numberOfPallets;
    private int trailers;

    /**
     * Construtor para objetos da classe Lorry
     */
    public Lorry(int numberOfPallets, int trailers, String licensePlate)
    {
        super(licensePlate);
        this.numberOfPallets = numberOfPallets;
        this.trailers = trailers;
    }
    

    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */
    public int getNumberOfPallets()
    {
        return numberOfPallets;
    }
    public int getTrailers()
    {
        return trailers;
    }
    public void setNumberOfPallets(int numberOfPallets)
    {
        if(numberOfPallets >= 0)
        this.numberOfPallets = numberOfPallets;
    }
    public void setTrailers(int trailers)
    {
        if(trailers >= 0)
        this.trailers = trailers;
    }
     @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(String.format("%s: %s\n", "Número de Paletes", numberOfPallets));
        sb.append(String.format("%s: %s\n", "Trailer", trailers));
        
        return sb.toString();
    }
}
