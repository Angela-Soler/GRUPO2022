/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author user
 */
public class Deportista extends Persona {
    
    private String tipoNados;
    private String competiciones;
    
     @Override
    String getNombre() {
        return("Katherin Trochez");
    }

    @Override
    int getEdad() {
        return (25);
    }

    @Override
    String getEspecialidad() {
        return("Natacion");
    }
    
    //metodos establecer de la variables
    public void establecerTipoNados(String _tipoNados){
        this.tipoNados = _tipoNados;
    }
    
    public void establecerCompeticiones(String _competiciones){
        this.competiciones = _competiciones;
    }
    
    //metodos obtener de la variables
    public String obtenerTipoNados(){
        return tipoNados;
    }
    
    public String obtenerCompeticiones(){
        return competiciones;
    }
}
