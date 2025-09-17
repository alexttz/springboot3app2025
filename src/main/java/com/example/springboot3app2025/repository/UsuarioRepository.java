package com.example.springboot3app2025.repository;

import com.example.springboot3app2025.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
