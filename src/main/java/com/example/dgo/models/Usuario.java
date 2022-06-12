package com.example.dgo.models;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name="usuarios")
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1975596775335290666L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="nombre", nullable = false, length = 25)
    private String nombre;

    @Column(name="apellido", nullable = false, length = 25)
    private String apellido;

    @Column(name="email",nullable = false, length = 25, unique = true)
    private String email;

    @Column(name="direccion", nullable = false, length = 25)
    private String direccion;

    public Usuario() {
    }

    public Usuario( String nombre, String apellido, String email, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.direccion = direccion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
