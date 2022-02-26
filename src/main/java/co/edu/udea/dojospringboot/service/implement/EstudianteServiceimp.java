package co.edu.udea.dojospringboot.service.implement;

import co.edu.udea.dojospringboot.model.Estudiante;
import co.edu.udea.dojospringboot.repository.EstudianteRepository;
import co.edu.udea.dojospringboot.service.EstudianteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EstudianteServiceimp implements EstudianteService {

    private final EstudianteRepository estudianteRepository;


    @Override
    public void crearEstudiante(Estudiante estudiante) {
        estudianteRepository.save(estudiante);

    }

    @Override
    public  Estudiante getEstudiante(Integer id){
        return estudianteRepository.findById(id).orElse(null);

    }
}
