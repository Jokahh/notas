package com.jokaah.notas.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.jokaah.notas.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Usuario findByNombre(String nombre);

}
