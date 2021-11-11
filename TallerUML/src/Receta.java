
import java.util.ArrayList;
import java.util.Date;
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
public class Receta {
    protected Date fecha;
    protected List<Medicamento> medicamentos;
    protected PlanNutricional planNut;
    protected Paciente paciente;
    protected Doctor doctor;

    public Receta() {
        
        this.medicamentos=new ArrayList<>();

    }

    public Receta(Date fecha) {

        this.fecha = fecha;
        this.planNut = new PlanNutricional();
        this.paciente = new Paciente();
        this.doctor = new Doctor();
        this.medicamentos=new ArrayList<>();

    }
	
}
