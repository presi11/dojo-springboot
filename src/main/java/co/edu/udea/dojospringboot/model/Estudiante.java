package co.edu.udea.dojospringboot.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "estudiantes")
public class Estudiante {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String nombre;
    @Column
    private String carrera;
}
