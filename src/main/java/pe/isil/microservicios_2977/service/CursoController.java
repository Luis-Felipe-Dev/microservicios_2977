package pe.isil.microservicios_2977.service;

import org.springframework.web.bind.annotation.*;
import pe.isil.microservicios_2977.model.Curso;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CursoController {
    private static Map<Integer, Curso> cursos = new HashMap<>();
    @PostMapping("/curso")
    public String agregar(@RequestBody Curso curso){
        cursos.put(curso.getId(), curso);
        return "";
    }

    @GetMapping("/curso")
    public List<Curso> listar(){
        return new ArrayList<>(cursos.values());
    }
}
