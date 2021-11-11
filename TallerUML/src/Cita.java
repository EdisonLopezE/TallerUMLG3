
import java.util.Date;



public class Cita {
    protected Date fecha;
    protected boolean pagada;
    protected String registradoPor; 
    public void realizarPago(Pago pago){
        System.out.println("Pago realizado...");
    }
    
    
}
