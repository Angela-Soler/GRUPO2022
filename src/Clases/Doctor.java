/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Marlon_imachito
 */
public class Doctor extends Persona {
    
    //variables privadas de la clase
    private String estudio;
    private String hospital;
    
    //los metodos abstractos de la superclase
    @Override
    public String getNombre() {
        return("Marlon Noe Nieto Ferrera");
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
    //termina el codigo de la clase Doctor
    
}
