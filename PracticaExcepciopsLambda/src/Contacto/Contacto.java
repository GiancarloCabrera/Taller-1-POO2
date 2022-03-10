package Contacto;

import javax.security.auth.login.AccountException;

public class Contacto {
    private String nombre;
    private String numTelefono;

    public Contacto(String nombre, String numTelefono) {
        this.setNombre(nombre);
        this.setNumTelefono(numTelefono);
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNumTelefono() {
        return numTelefono;
    }
    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public void filtrar(String filtro)  throws AccountException {
        
    }

    
}
