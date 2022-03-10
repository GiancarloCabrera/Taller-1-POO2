package profesor;

import javax.security.auth.login.AccountException;

public class Profesor{
    private String nombre;
    private String apellido;
    private int identificacion;
    private int tipoContrato;

    public Profesor(String nombre, String apellido, Integer identificacion, int tipoContrato){
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setIdentificacion(identificacion);
        this.setTipoContrato(tipoContrato);
    }

    public int getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(int tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(Integer identificacion) {
        this.identificacion = identificacion;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void tipoContrato(int c) throws AccountException{
        if(c == 1){
            System.out.println("Has seleccionado TIEMPO COMPLETO");
        } else if( c == 2){
            System.out.println("Has seleccionado CATEDRA");
        }else{
            throw new AccountException("Opcion de tipo de contrato no encontrada...");
        }
    }
}