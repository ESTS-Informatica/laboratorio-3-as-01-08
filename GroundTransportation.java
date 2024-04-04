
/**
 * Escreva uma descrição da classe GroundTransportation aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class GroundTransportation extends Transport
{
    
    private String licensePlate;
    private static final double FEES = 3.0;
    /**
     * Construtor para objetos da classe GroundTransportation
     */
    public GroundTransportation(String licensePlate){
        this.licensePlate = licensePlate;
        
    }

    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */
    public String getLicensePlate()
    {
        return licensePlate;
    }
    public void setLicensePlate(String licensePlate){
        if (licensePlate != null)
        this.licensePlate = licensePlate;
        
    }
}
