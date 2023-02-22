package com.jokaah.notas.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jokaah.notas.models.Nota;
import com.jokaah.notas.services.NotaService;

@RestController
public class NotaController {

    @Autowired
    NotaService notaService;

    @GetMapping("/notas")
    List<Nota> all() {
        return notaService.findAll();
    }

    @GetMapping("/notas/buscar")
    List<Nota> findPorTituloYFecha(@RequestParam(required = false) String titulo,
            @RequestParam(required = false) @DateTimeFormat(pattern = "dd-MM-yyyy") Date fecha) {

        return notaService.findPorTituloYFecha(titulo, fecha);
    }

    @GetMapping("/notas/{id}")
    Nota find(@PathVariable int id) {
        return notaService.findById(id);
    }

    @PostMapping("/notas")
    Nota save(@RequestBody Nota nota) {
        notaService.save(nota);
        return nota;
    }

    @PutMapping("/notas/{id}")
    void update(@PathVariable int id, @RequestBody Nota nota) {
        notaService.update(id, nota);
    }

    @DeleteMapping("/notas/{id}")
    void delete(@PathVariable int id) {
        notaService.deleteById(id);
    }

}
