
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jjmg0
 */
public class Persona {
    
    protected String usuario;
    protected String clave;
    protected String nombre;
    protected String apellido;
    protected String cedula;
    protected String direccion;
    protected Date fechaNacimiento;
    
    // true significa exitoso
    public boolean logIn(){
        return true;
    }
    
    public boolean logOut(){
        return true;
    }
    
}
