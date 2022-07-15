/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajogrupo2022;

import Clases.Deportista;
import Clases.Doctor;

/**
 *
 * @author user
 */
public class TrabajoGrupo2022 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            System.out.println("Trabajo Grupal. Programación Orientada a Objetos 2022");
            
            //Instanciamos las subclases
            Doctor D = new Doctor();
            Deportista De = new Deportista();
            
            //Imprimimos los valores get y set de la clase Doctor
            System.out.println("Nombre: "+D.getNombre());
            System.out.println("Edad: "+D.getEdad());
            System.out.println("Especialidd: "+D.getEspecialidad());
            D.establecerEstudio("Especialista en Neurocirugia");
            D.establecerHospital("Mario C. Rivas");
            System.out.println("Estudios: "+D.obtenerEstudio());
            System.out.println("Hospital:"+D.obtenerHospital());
            
            //Imprimimos los valores get y set de la clase Deportista
            System.out.println("Nombre: "+De.getNombre());
            System.out.println("Edad: "+De.getEdad());
            System.out.println("Especialidad: "+De.getEspecialidad());
            De.establecerTipoNados("Mariposa, Espalda, Brazada");
            De.establecerCompeticiones("100, 50, 25 metros");
            System.out.println("Tipos Nado:"+De.obtenerTipoNados());
            System.out.println("Competiciones"+De.obtenerCompeticiones());
            
    }
    
}
