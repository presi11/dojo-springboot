package co.edu.udea.dojospringboot.controller;

import co.edu.udea.dojospringboot.model.Estudiante;
import co.edu.udea.dojospringboot.service.EstudianteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "estudiante")
public class EstudianteController {

    private final EstudianteService estudianteService;

    @PostMapping()
    public String crearEstudiante(@RequestBody Estudiante estudiante){
        estudianteService.crearEstudiante(estudiante);
        return "Estudainte Creado";

    }

    @GetMapping("/id")
    public  Estudiante getEstudiante(@PathVariable("id") Integer id){
        return estudianteService.getEstudiante(id);
    }
}
