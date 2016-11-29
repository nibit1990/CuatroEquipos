package gus.cuatroequipos;

/**
 * Created by Gus on 26/09/2016.
 */
public class Equipo {

    //Atributos
    int id;



    
    String equipo ;
    int puntos ;

    // Constructores

    public Equipo(int id, String equipo ) {
        this.id = id;
        this.equipo = equipo;

    }



    //Comportamientos - metodos

    public void mostrarEquipos(){
        // Comportamiento del metodo
        System.out.println("Datos del telefono");
        System.out.println("ID:" + id);
        System.out.println("Equipo: " + equipo);
        System.out.println("Puntos: " + puntos);

    }



}
