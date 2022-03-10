import java.util.ArrayList;
import java.util.List;

import Contacto.Contacto;

public class App {
    public static void main(String[] args) throws Exception {

        Contacto contacto1 = new Contacto("Rogelio", "822962926");
        Contacto contacto2 = new Contacto("Julian", "9869237230");
        Contacto contacto3 = new Contacto("Maria", "332208732");
        Contacto contacto4 = new Contacto("Juan", "387755732");
        Contacto contacto5 = new Contacto("Juan", "38778976");
        Contacto contacto6 = new Contacto("Juan", "0775667567");


        
        List<Contacto> listaContactos = new ArrayList<Contacto>();
        listaContactos.add(contacto1);
        listaContactos.add(contacto2);
        listaContactos.add(contacto3);
        listaContactos.add(contacto4);
        listaContactos.add(contacto5);
        listaContactos.add(contacto6);

        listaContactos.forEach((n) -> System.out.println("Nombre: " + n.getNombre() + ' ' + "Numero Telefono: " +  n.getNumTelefono()));

        try{
            listaContactos.stream().filter(nombre -> nombre.getNombre("Juan")).
        }


    }
}
