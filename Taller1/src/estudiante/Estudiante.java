package estudiante;

import javax.security.auth.login.AccountException;

public class Estudiante {
    private String nombre;
    private String apellido;
    private int identificacion;
    private int semestre;

    public Estudiante(String nombre, String apellido, int identificacion, int semestre){
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setIdentificacion(identificacion);
        this.setSemestre(semestre);
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
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

    public void semestre(int sem) throws AccountException{
        if(sem > 10 || sem < 1){
            throw new AccountException("El semestre que ha escrito no existe...");
        }
    }
    
}
