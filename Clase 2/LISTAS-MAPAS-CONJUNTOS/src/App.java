import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class App {
    public static void main(String[] args) throws Exception {

        //COLECCIONES-----------------------------------------------------
        List<String> nombres = new ArrayList<String>();
        nombres.add("Juan");
        nombres.add("Carlos");
        nombres.add("Cesar");
        System.out.println("Tamano " + nombres.size()); //Mostrar tamano de la lista

        //Remover el 2do item de la lista
        nombres.remove(1);

        //Recorrer una coleccion
        for(String nom : nombres){ //Se referencia la variable y la coleccion a recorrer
            System.out.println("Nombres " + nom); //En las listas siempre se printea {i1, i2, i3}
        }

        //MAPS--------------------------------------------------------------------
        Map<Integer, String> personas = new HashMap<Integer, String>();
        personas.put(1, "Juancho");
        personas.put(2, "Graciela");
        System.out.println(personas); //En los mapas siempre se printea {k1=valor, k2=valor}

        //Recorrer un MAP
        System.out.println(personas.keySet()); //keySet para las llaves de los valores del MAP 
        System.out.println(personas.values()); //Para acceder a los valores

        //PRACTICA PLAYLIST
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la opcion que desea");
        System.out.println("1: Agregar nueva cancion");
        System.out.println("2: Encontrar el titulo de la cancion por la posicion que se de");
        System.out.println("3: Eliminar una cancion");
        System.out.println("4: Reemplazar el titulo de una cancion");
        System.out.println("5: Saber el numero de canciones de su playlist");
        System.out.println("0 Salir");

        int option = scan.nextInt();
        do{List<String> playList = new ArrayList<String>();
            playList.add("On top of the world");
            playList.add("Radioctive");
            playList.add("Sweet Child of Mine");
            switch(option){
                case 1: 
                    System.out.println("Ingrese el nombre de la cancion que desea agregar");
                    Scanner song = new Scanner(System.in);
                    String nombre = song.nextLine();
                    playList.add(nombre);
                    for(String list : playList){
                        System.out.print("Lista de favoritos: ");
                        System.out.println(list);
                    }
                    break;
                case 2:
                    System.out.println("Ingrese la posicion de la cancion que desea conocer");
                    Scanner position = new Scanner(System.in);
                    int numero = position.nextInt();
                    if(numero >= playList.size()){
                        System.out.println("No hay ninguna cancion en esta posicion");
                    }else{
                        System.out.print("Lista de favoritos: ");
                        System.out.print(playList.get(numero)); 
                    }
                    
                    break;
                case 3:
                    System.out.println("Escriba la posicion de la cancion que desea eliminar");
                    Scanner position2 = new Scanner(System.in);
                    int numero2 = position2.nextInt();
                    if(numero2 >= playList.size()){
                        System.out.println("No existe ninguna cancion en esa posicion, por ende no se puede eliminar");
                    }else{
                        playList.remove(numero2);
                        for(String list : playList){
                            System.out.print("Lista de favoritos: ");
                            System.out.println(list);
                        }
                        System.out.println("Cancion exitosamente eliminada");
                    }
                    break;
                case 4:
                    System.out.println("Escriba la posicion de la cancion cuyo nombre desea reemplazar: ");
                    Scanner position3 = new Scanner(System.in);
                    int numero3 = position3.nextInt();
                    if(numero3 >= playList.size()){
                        System.out.println("No existe una cancion en la posicion dada...");
                        break;
                    }else{
                        System.out.print("Escriba el nombre de la cancion a agregar: ");
                        Scanner cancion = new Scanner(System.in);
                        String name = cancion.nextLine();

                        playList.set(numero3, name);
                        break;
                    }
                    
                   
                case 5:
                    System.out.println("El numero de canciones en su Playlist es: " + playList.size());
                    break;
            }
        }while(option != 0);
        
        
    }

     

    
}
