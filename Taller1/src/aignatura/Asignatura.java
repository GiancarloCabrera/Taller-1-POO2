package aignatura;

import javax.security.auth.login.AccountException;

public class Asignatura {
    private String nombreMateria;
    private int idEstudiante;
    private int idProfesor;
    private Float nota;
    public Asignatura(String nombreMateria, Integer idEstudiante, Integer idProfesor, Float nota) {
        this.setNombreMateria(nombreMateria);
        this.setidEstudiante(idEstudiante);
        this.setidProfesor(idProfesor);
        this.setNota(nota);
    }
    public String getNombreMateria() {
        return nombreMateria;
    }
    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }
    public Float getNota() {
        return nota;
    }
    public void setNota(Float nota) {
        this.nota = nota;
    }
    public Integer getidProfesor() {
        return idProfesor;
    }
    public void setidProfesor(Integer idProfesor) {
        this.idProfesor = idProfesor;
    }
    public int getidEstudiante() {
        return idEstudiante;
    }
    public void setidEstudiante(Integer idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public void notaMateria(Float n) throws AccountException{
        if(n < 0.0){
            throw new AccountException("La nota digitada es menor a la minima nota permitida...");
        }else if(n > 5.0){
            throw new AccountException("La nota digitada es mayor a la maxima nota permitida...");
        }
    }
    
    
}
