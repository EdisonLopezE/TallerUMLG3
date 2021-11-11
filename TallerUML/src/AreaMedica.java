
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class AreaMedica {
    
    protected String especialidad;
    protected float costo;
    protected List<Doctor> doctores;

    public AreaMedica() { 
        this.doctores= new ArrayList<>();
    }

    public AreaMedica(String especialidad, float costo) {

        this.especialidad = especialidad;
        this.costo = costo;
        this.doctores= new ArrayList<>();
	
    }  
}
