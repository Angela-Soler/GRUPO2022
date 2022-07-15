/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author admin
 */
public class Doctor extends Persona {
    private String estudio;
    private String hospital;
    
    @Override
    public String getNombre() {
        return("Marlon Noe Nieto");
    }

    @Override
    public int getEdad() {
        return (30);
    }

    @Override
    public String getEspecialidad() {
        return("Neurocirujano");
    }
    
    //metodos establecer de la variables
    public void establecerEstudio(String _estudio){
        this.estudio = _estudio;
    }
    
    public void establecerHospital(String _hospital){
        this.hospital = _hospital;
    }
    
    //metodos obtener de la variables
    public String obtenerEstudio(){
        return estudio;
    }
    
    public String obtenerHospital(){
        return hospital;
    }
    
}
