package com.mycompany.peluqueriacanina.persistencia;

import com.mycompany.peluqueriacanina.logica.Dueno;
import com.mycompany.peluqueriacanina.logica.Mascotas;


public class ControladoraPersistencia {
    
    DuenoJpaController duenoJpa = new DuenoJpaController();
    MascotasJpaController mascoJpa = new MascotasJpaController();

    public void guardar(Dueno dueno, Mascotas masco) {
        
        //crear dueno en bd
        duenoJpa.create(dueno);
        
        mascoJpa.create(masco);
        
    }
    
    
    
    
}
