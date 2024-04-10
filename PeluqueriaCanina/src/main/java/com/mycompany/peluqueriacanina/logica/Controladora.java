
package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.persistencia.ControladoraPersistencia;


public class Controladora {
    
    ControladoraPersistencia controladoraPersis = new ControladoraPersistencia();

    public void guardar(String nombre, String raza, String color, String observaciones, String alergico, String atenEsp, String nombreDueno, String celular) {
     
        Dueno dueno = new Dueno();
        dueno.setNombre(nombreDueno);
        dueno.setCelDueno(celular);
        
        Mascotas masco = new Mascotas();
        masco.setNombre(nombre);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(atenEsp);
        masco.setObservaciones(observaciones);
        masco.setUnDueno(dueno);
        
        controladoraPersis.guardar(dueno,masco);
        
    }
    
}
