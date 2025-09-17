package com.example.springboot3app2025.service;

import java.util.List;
import java.util.Optional;

import com.example.springboot3app2025.model.Usuario;
import com.example.springboot3app2025.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;



@Service
public class UsuarioService implements IUsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepo;

    public Usuario buscarPorId(Long id) {
        Optional<Usuario> usuarioOp = usuarioRepo.findById(id);
        if (usuarioOp.isPresent()) {
            return usuarioOp.get();
        }
        throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Id inexistente");
    }
    public Usuario novoUsuario(Usuario usuario){
        if (usuario.getNome() == null || usuario.getSenha() == null){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Nome ou senha invalido");
        }
        return usuarioRepo.save(usuario);
    }
    public List<Usuario> buscarTodos(){
        return usuarioRepo.findAll();
    }
}


