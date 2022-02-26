package co.edu.udea.dojospringboot.service;

import co.edu.udea.dojospringboot.model.Estudiante;

public interface EstudianteService {
    void crearEstudiante(Estudiante estudiante);

    Estudiante getEstudiante(Integer id);
}
