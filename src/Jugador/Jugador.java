/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jugador;

/**
 *
 * @author Miguel
 */
public class Jugador {
    
    //ATRIBUTOS
    
    public String nombre;
    public static int categoriaSeleccionada;
    
    // METODO CONSTRUCTOR
    public Jugador(){
        nombre = "NONE";
        categoriaSeleccionada = 0;
    }
    
    public Jugador(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public static int get_categoriaSeleccionada() {
        return categoriaSeleccionada;
    }
    
    public void set_categoriaSeleccionada(int categoriaSeleccionada) {
        this.categoriaSeleccionada = categoriaSeleccionada;
    }
    
}
