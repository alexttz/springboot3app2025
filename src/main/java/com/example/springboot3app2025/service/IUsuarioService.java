package com.example.springboot3app2025.service;

import com.example.springboot3app2025.model.Usuario;

import java.util.List;

public interface IUsuarioService {
    public Usuario buscarPorId(Long id);
    public Usuario novoUsuario(Usuario usuario);
    public List<Usuario> buscarTodos();
}
