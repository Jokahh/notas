package com.jokaah.notas.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.jokaah.notas.models.Permiso;


public interface PermisoRepository extends JpaRepository<Permiso, Integer> {
}
