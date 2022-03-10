import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import aignatura.Asignatura;
import estudiante.Estudiante;
import profesor.Profesor;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        int option;
        List<Estudiante> estudianteList = new ArrayList<Estudiante>();
        List<Profesor> profesorList = new ArrayList<Profesor>();
        List<Asignatura> asignaturaList = new ArrayList<Asignatura>();
        do{ 
            System.out.println("Bienvenid@ al sistema de registros...");
            System.out.println("Digita la opcion que deseas usar:");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Registrar profesor");
            System.out.println("3. Registrar materia");
            System.out.println("4. Salir del sistema");

            option = scan.nextInt();
            switch(option){
                case 1: 
                    try{ 
                        System.out.println("Ingresa el nombre del estudiante: ");
                        String nombre = scan.next();
                        System.out.println("Ingresa el apellido del estudiante: ");
                        String apellido = scan.next();
                        System.out.println("Ingresa la identificacion del estudiante: ");
                        Integer id = scan.nextInt();
                        System.out.println("Ingrese el numero de semestre a cursar del estudiante: ");
                        Integer semestre = scan.nextInt();
                        Estudiante estudiante = new Estudiante(nombre, apellido, id, semestre);

                         estudiante.setNombre(nombre);
                         estudiante.setApellido(apellido);
                         estudiante.setIdentificacion(id);
                         estudiante.setSemestre(semestre);

                        estudiante.semestre(semestre);
                        estudianteList.add(estudiante);
                        
                    } catch (Exception e) {
                        //TODO: handle exception
                        System.out.println("Error!!! " + e.getMessage());
                    }
                        // System.out.println(estudianteList);
                        estudianteList.forEach((s) -> System.out.println("Nombre: " + s.getNombre() + " Apellido: " + s.getApellido() + 
                        " Identificacion:  " + s.getIdentificacion() + " Semestre: " + s.getSemestre() ));
                    
                    //Revisar y finalizar la seccion de estudiante

                    break;

                case 2: 
                    try{
                        Scanner profesorScan = new Scanner(System.in);
                        System.out.println("Ingresa el nombre del profesor: ");
                        String nombreP = scan.next();
                        System.out.println("Ingresa el apellido del profesor: ");
                        String apellidoP = scan.next();
                        System.out.println("Ingresa la identificacion del profesor: ");
                        Integer idP = scan.nextInt();
                        System.out.println("Tipo de Contrato: Digite el numero -> 1.Tiempo completo o 2.Catedra");
                        Integer tipoCont = scan.nextInt();
                        Profesor profesor = new Profesor(nombreP, apellidoP, idP, tipoCont);

                        profesor.setNombre(nombreP);
                        profesor.setApellido(apellidoP);
                        profesor.setIdentificacion(idP);
                        profesor.setTipoContrato(tipoCont);
                        profesor.tipoContrato(tipoCont);
                        profesorList.add(profesor);
                    

                    }catch(Exception z){
                        System.out.println("Error!!! " + z.getMessage());
                    }

                        profesorList.forEach((p) -> System.out.println("Nombre: " + p.getNombre() + " Apellido: " + p.getApellido()
                         + " Identficacion: " + p.getIdentificacion() + " Tipo de contrato: " + p.getTipoContrato() ));

                    break;

                case 3: 

                    
                    try{
                        int idStudent = 0;
                        int idProfesor = 0;
                        System.out.println("Ingresa el nombre de la materia: ");
                        String nombreMat = scan.next();
                        System.out.println("Ingresa id del estudiante a cursar la materia: ");
                        Integer idEs = scan.nextInt();
                        List<Estudiante> listaEstudiante = 
                        estudianteList.stream().filter(elem -> elem.getIdentificacion() == idEs).collect(Collectors.toList());
                        if(listaEstudiante.size() == 0){
                            System.out.println("El id de estudiante digitado no existe!!!");
                            break;
                        }else{
                            idStudent = idEs;
                        }


                        System.out.println("Ingresa el id del profesor de la materia: ");
                        Integer idProfMat = scan.nextInt();
                        List<Profesor> listaProfesor = 
                        profesorList.stream().filter(elem2 -> elem2.getIdentificacion() == idProfMat).collect(Collectors.toList());
                        if(listaProfesor.size() == 0){
                            System.out.println("El id de profesor digitado no existe!!!");
                            break;
                        }else{
                            idProfesor = idProfMat;
                        }

                        System.out.println("Ingresa la nota: ");
                        Float nota = scan.nextFloat();
                        Asignatura materia = new Asignatura(nombreMat, idStudent, idProfesor, nota);
                        materia.setNombreMateria(nombreMat);
                        materia.setidEstudiante(idEs);
                        materia.setidProfesor(idProfesor);
                        materia.setNota(nota); 

                        materia.notaMateria(nota);
                        asignaturaList.add(materia);
                    }catch(Exception t){
                        System.out.println("Error!!! " + t.getMessage());
                    }


                    asignaturaList.forEach((a) -> System.out.println("Nombre materia: " + a.getNombreMateria() + " Id estudiante: " + a.getidEstudiante()
                     + " Id Profesor: " + a.getidProfesor() + " Nota:  " + a.getNota()));
                    
                    break;
            }
        }while(option != 4);
    }
}
