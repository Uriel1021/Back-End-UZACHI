package com.uriel.AplicacionBackEndUzachi.example.Users.Model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table
@Getter
@Setter
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id; // Identificador unico del usuario
    @Column(name = "firstName")
    private String firstName; // Nombre del usuario
    @Column(name = "lastName")
    private String lastName; // Apellido paterno del usuario
    @Column(name = "middleName")
    private String middleName; // Apellido materno del usuario
    @Column(name = "email")
    private String email; // Correo electronico del usuario
    @Column(name = "phone")
    private String phone; // Telefono del usuario
    @Column(name = "position")
    private String position; // Cargo del usuario
    @Column(name = "username")
    private String username; // Modo de acceso al sistema
    @Column(name = "password")
    private byte[] password; // Contrasenia para acceder
}