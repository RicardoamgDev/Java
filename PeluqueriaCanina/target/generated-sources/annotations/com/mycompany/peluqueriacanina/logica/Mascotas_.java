package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.logica.Dueno;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-03-26T19:54:51", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Mascotas.class)
public class Mascotas_ { 

    public static volatile SingularAttribute<Mascotas, Integer> num_cliente;
    public static volatile SingularAttribute<Mascotas, String> nombre_perro;
    public static volatile SingularAttribute<Mascotas, String> raza;
    public static volatile SingularAttribute<Mascotas, String> color;
    public static volatile SingularAttribute<Mascotas, String> alergico;
    public static volatile SingularAttribute<Mascotas, String> observaciones;
    public static volatile SingularAttribute<Mascotas, String> atencion_especial;
    public static volatile SingularAttribute<Mascotas, Dueno> unDueno;

}