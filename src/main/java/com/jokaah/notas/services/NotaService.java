package com.jokaah.notas.services;

import java.util.Date;
import java.util.List;

import com.jokaah.notas.models.Nota;

public interface NotaService {
    public List<Nota> findAll();

    public List<Nota> findPorTituloYFecha(String titulo, Date fecha);

    public Nota findById(int id);

    public Nota save(Nota nota);

    public void update(int id, Nota nota);

    public void deleteById(int id);

    public void deleteAll();
}
