package com.example.demo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class Usuario {

    @Column(length = 50, unique = true, nullable = false)
    public String nombreUsuario;
    @Column(length = 50)
    public String nombre;
    @Column(length = 50)
    public String apellidos;
    @Column(name="mail", nullable = false, length = 50, unique = true)
    public String email = "";
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int nivelAcceso;

    @Override
    public String toString() {
        return "Nombre de Usuario; " + nombreUsuario + "\r\n"
                + "nombre: " + nombre + "\r\n"
                + "apellidos: " + apellidos + "\r\n"
                + "email: " + email + "\r\n"
                + "nivel de acceso: " + nivelAcceso;
    }
}
