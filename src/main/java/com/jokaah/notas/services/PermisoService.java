package com.jokaah.notas.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jokaah.notas.models.Permiso;
import com.jokaah.notas.repositories.PermisoRepository;

@Service
public class PermisoService {

    @Autowired
    private PermisoRepository permisoRepository;

    public Permiso createPermiso(Permiso permiso) {
        return permisoRepository.save(permiso);
    }

    public Permiso updatePermiso(Permiso permiso) {
        return permisoRepository.save(permiso);
    }

    public void deletePermiso(int permisoId) {
        permisoRepository.deleteById(permisoId);
    }

    public Permiso getPermiso(int permisoId) {
        return permisoRepository.findById(permisoId).orElse(null);
    }

    public List<Permiso> getAllPermisos() {
        return permisoRepository.findAll();
    }
}
