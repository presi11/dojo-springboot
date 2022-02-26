package co.edu.udea.dojospringboot.repository;

import co.edu.udea.dojospringboot.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Integer> {


}
