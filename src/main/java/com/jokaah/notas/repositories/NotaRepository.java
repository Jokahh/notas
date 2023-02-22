package com.jokaah.notas.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jokaah.notas.models.Nota;

@Repository
public interface NotaRepository extends JpaRepository<Nota, Integer> {

    public List<Nota> findByTituloContainingAndFechaGreaterThan(String titulo, Date fecha);

    /*
     * public List<Nota> findPorTituloYFecha(String titulo, Date fecha) {
     * List<Nota> todasLasNotas = notaRepository.findAll();
     * List<Nota> notas = new ArrayList<Nota>();
     * 
     * for (Nota nota : todasLasNotas) {
     * if (titulo != null && fecha != null) {
     * Date fechaConvertida = new SimpleDateFormat("dd-mm-yyyy").parse(fecha);
     * if (nota.getTitulo().contains(titulo) &&
     * nota.getFecha().after(fechaConvertida)) {
     * notas.add(nota);
     * }
     * } else if (fecha == null) {
     * if (nota.getTitulo().contains(titulo)) {
     * notas.add(nota);
     * }
     * } else if (titulo == null) {
     * Date fechaConvertida = new SimpleDateFormat("dd-mm-yyyy").parse(fecha);
     * if (nota.getFecha().after(fechaConvertida)) {
     * notas.add(nota);
     * }
     * }
     * 
     * }
     * return notas;
     * }
     */
}
